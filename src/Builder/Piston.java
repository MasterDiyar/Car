package Builder;

public class Piston {
    public float Differential = 3.8f;
    public float GearRatio = 0.85f;

    public Piston() {}

    public Piston(float differential, float gearRatio) {
        Differential = differential;
        GearRatio = gearRatio;
    }
}
