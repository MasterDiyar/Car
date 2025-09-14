package Builder.Sensor;

public class BeltSensor extends Sensor {

    public BeltSensor(int id, float length) {
        super(id);
        Length = length;
    }

    public BeltSensor(int id) {
        super(id);
        Length = 10.0f;
    }
    private float Length;

    private boolean buckled = false;

    public void attach(){if (State != state.ON)buckled = !buckled; System.out.println("Belt is broken or turned off");}

    public boolean isBuckled() {if (State != state.ON)return buckled; System.out.println("Belt is broken or turned off"); return buckled;}

    public float getLength() {if (State != state.ON)return Length;else System.out.println("Belt is broken or turned off");  return 0.0f;}
}
