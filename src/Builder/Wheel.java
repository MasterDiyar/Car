package Builder;

public class Wheel {
    private float wheelRadius = 0.32f; // m (radius, not diameter)
    private float tireRadius = 0.32f; // m
    private String tireType;

    public Wheel(float wheelRadius, float tireRadius, String tireType) {
        this.wheelRadius = wheelRadius;
        this.tireRadius = tireRadius;
        this.tireType = tireType;
    }

    public float getWheelScale() {
        return (wheelRadius + tireRadius) * (wheelRadius + tireRadius); // square of radius
    }

    public float getWheelRadius() {
        return wheelRadius + tireRadius; // total radius
    }

    public float getWheelDiameter() {
        return 2 * getWheelRadius(); // total diameter
    }

    public float getWheelCircumference() {
        return (float) (2 * Math.PI * getWheelRadius());
    }

    // Getters and setters
    public float getWheelRadiusOnly() { return wheelRadius; }
    public Wheel setWheelRadius(float wheelRadius) { this.wheelRadius = wheelRadius; return this; }

    public float getTireRadius() { return tireRadius; }
    public Wheel setTireRadius(float tireRadius) { this.tireRadius = tireRadius; return this; }

    public String getTireType() { return tireType; }
    public Wheel setTireType(String tireType) { this.tireType = tireType; return this;}
}
