package Builder.Sensor;

public class NavigationSensor extends Sensor {
    public enum facing{
        NORTH,SOUTH,EAST,WEST,NORTHEAST,NORTHWEST,SOUTHEAST,SOUTHWEST
    }
    public facing Facing = facing.NORTH;

    public String getDirection(){
        return Facing.name();
    }
    public NavigationSensor(int id){
        super(id);
    }
}
