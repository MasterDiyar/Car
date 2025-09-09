package Builder.Sensor;

import java.util.Random;

public class TemperatureSensor extends Sensor {

    private int temperature;
    public TemperatureSensor(int id) {
        super(id);
    }

    public int getTemperature() {
        Random rand = new Random();
        temperature = rand.nextInt(-50, 50);
        return temperature;
    }

    @Override
    public String GetInfo(){
        if(temperature <= -50) State = state.DAMAGED;
        if(temperature >= 50) State = state.OFF;
        return switch (temperature){
            case -50 -> "temperature less than 50, sensor is damaged";
            case 50 -> "temperature greater than 50, sensor is off";
            default -> (State == state.ON)? "temperature is "+temperature: "Temperature sensor is off or damaged";
        };
    }

}
