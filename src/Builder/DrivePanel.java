package Builder;

import Builder.Sensor.BeltSensor;
import Builder.Sensor.NavigationSensor;
import Builder.Sensor.TemperatureSensor;

import java.util.ArrayList;
import java.util.List;

public class DrivePanel {
    List<BeltSensor> belt = new ArrayList<BeltSensor>();
    NavigationSensor navigation;
    TemperatureSensor temperature;

    public DrivePanel(){
        var b = new BeltSensor(1);
        belt.add(b);
        navigation = new NavigationSensor(2);
        temperature = new TemperatureSensor(3);
    }

    public DrivePanel(int count, BeltSensor belt, NavigationSensor navigation, TemperatureSensor temperature) {
        this.belt = new ArrayList<BeltSensor>();
        for (int i = 0; i < count; i++) {
            this.belt.add(belt);
        }
        this.navigation = navigation;
        this.temperature = temperature;
    }

    public DrivePanel addNavigation(NavigationSensor navigation) {
        this.navigation = navigation;
        return this;
    }

    public DrivePanel addTemperature(TemperatureSensor temperature) {
        this.temperature = temperature;
        return this;
    }

    public DrivePanel addBelt(BeltSensor belt) {
        this.belt.add(belt);
        return this;
    }

    public BeltSensor getBelt(int index) {
        return belt.get(index);
    }
    public NavigationSensor getNavigation(int index) {
        return navigation;
    }
    public TemperatureSensor getTemperature(int index) {
        return temperature;
    }

    @Override public String toString() {

        return "car have "+belt.size()+" belts, 1 navigation sensor and 1 temperature sensor.";

    }
}
