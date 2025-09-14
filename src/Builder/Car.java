package Builder;

public class Car {
    private Engine engine = new Engine();
    private Window window =  new Window();
    private Seat seat = new Seat("Leather", "no", 10, new float[]{0.6f,0.6f,0.6f});
    private Wheel wheel = new Wheel(0.64f,0.12f,"Rubber");
    private DrivePanel drivePanel = new DrivePanel();

    public Car addEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public Car addWindow(Window window) {
        this.window = window;
        return this;
    }

    public Car addSeat(Seat seat) {
        this.seat = seat;
        return this;
    }

    public Car addWheel(Wheel wheel) {
        this.wheel = wheel;
        return this;
    }

    public Car addDrivePanel(DrivePanel drivePanel) {
        this.drivePanel = drivePanel;
        return this;
    }

    public Car(){

    }

    @Override
    public String toString(){

        return "The car with "+window.toString()+ " window\n"+ seat.Material()+" seat, which is "+ seat.DelightLevel()+"\nengine which is "
              +engine.toString()+"\n wheel with "+ wheel.getWheelRadius() +" radius and drive panel with "+drivePanel.toString();
    }

}
