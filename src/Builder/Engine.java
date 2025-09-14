package Builder;

public class Engine{
    private int CylinderCount = 8;
    private String FuelType = "Diesel";
    private float FuelConsumption = 0.64f;
    public float RPM;
    private Piston EnginePiston =  new Piston();
    private Wheel EngineWheel = new Wheel(0.32f, 0.32f, "Standard");

    public Engine() {
        CylinderCount = 8;
        FuelType = "Diesel";
        FuelConsumption = 0.64f;
    }

    @Override
    public String toString() {
        return "You had: "+CylinderCount+" cylenders, "+FuelType+" fuel type, "+FuelConsumption+" l per km with basic piston ";
    }

    public int getWorkTime(int km) {
        if (RPM == 0)
            estimateRPM();

        float vehicleSpeed = calculateVehicleSpeed();

        if (vehicleSpeed == 0) {
            return 0; // Prevent division by zero
        }

        // Time = Distance / Speed (converted to seconds)
        float timeHours = km / vehicleSpeed;

        return (int) (timeHours * 3600);
    }
    private void estimateRPM() {
        float baseRPM = 2000f;

        float cylinderFactor = 1.0f - (CylinderCount - 4) * 0.05f;
        if (cylinderFactor < 0.7f) cylinderFactor = 0.7f;
        if (cylinderFactor > 1.3f) cylinderFactor = 1.3f;

        float fuelFactor = switch (FuelType) {
            case "Diesel" -> 0.8f;
            case "Electricity" -> 1.2f;
            default -> 1.0f;
        };
        this.RPM = baseRPM * cylinderFactor * fuelFactor;
    }

    private float calculateVehicleSpeed() {
        float wheelCircumference = (float) (2 * Math.PI * EngineWheel.getWheelRadius()); // m
        float speedMph = (RPM * wheelCircumference * 60) /
                (EnginePiston.GearRatio * EnginePiston.Differential * 1000); // m/h

        return speedMph; //  km/h
    }

    public float calculateEnergyPerKm() {  // energy consumption / km * MJ
        float fuelPerKm = FuelConsumption / 100f; // liters per km
        return fuelPerKm * GetEnergyFromFuel();
    }

    public float GetEnergyFromFuel(){
        return switch (FuelType) {
            case "Gasoline" -> 34.2f;
            case "Diesel" -> 35.8f;
            case "Ethanol" -> 21.2f;
            case "LPG", "GPL" -> 25.5f;
            case "Hydrogen" -> 10.1f;
            case "Electricity" -> 3.6f;
            default -> {
                System.out.println("Invalid Fuel Type");
                yield 0;
            }
        };
    }

    public Engine setPiston(Piston EnginePiston) {
        this.EnginePiston = EnginePiston;
        return this;
    }

    public Engine setWheel(Wheel EngineWheel) {
        this.EngineWheel = EngineWheel;
        return this;
    }

    public int getCylinderCount() { return CylinderCount; }
    public Engine setCylinderCount(int cylinderCount) { CylinderCount = cylinderCount; return this; }

    public String getFuelType() { return FuelType; }
    public Engine setFuelType(String fuelType) { FuelType = fuelType; return this; }

    public float getFuelConsumption() { return FuelConsumption; }
    public Engine setFuelConsumption(float fuelConsumption) { FuelConsumption = fuelConsumption; return this; }

    public float getRPM() { return RPM; }
    public Engine setRPM(float rpm) { RPM = rpm; return this; }

    public Piston getEnginePiston() { return EnginePiston; }

    public Wheel getEngineWheel() { return EngineWheel; }
}
