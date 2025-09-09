package Builder.Sensor;

public class Sensor {
    private int id;
    public enum state {
        ON,
        OFF,
        DAMAGED,
        DISTURBED
    }
    protected state State = state.ON;
    public String GetInfo(){
        return "";
    }
    public Sensor(int id) { this.id = id; }

    public int getId() {
        return id;
    }
}
