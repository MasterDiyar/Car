package Builder;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        Engine engine = new Engine();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter help for get help:)");

        String action = "";
        String[] scan;

        while (!action.equals("exit")) {
            scan = scanner.nextLine().split(" ");
            action = scan[0];
            switch (action) {
                case "engine":
                    for (int i = 1; i < scan.length; i+=2) {
                        switch (scan[i]) {
                            case "cylinder":
                                engine.setCylinderCount(Integer.parseInt(scan[i+1]));
                                break;
                            case "wheel":
                                engine.setWheel(new Wheel(Float.parseFloat(scan[i+1]), Float.parseFloat(scan[i+2]), scan[i+3]));
                                break;
                            case "piston":
                                engine.setPiston(new Piston());
                                break;
                            case "fuelType":
                                engine.setFuelType(scan[i+1]);
                                break;
                            case "rpm":
                                engine.setRPM(Float.parseFloat(scan[i+1]));
                                break;
                            case "fuelConsumption":
                                engine.setFuelConsumption(Float.parseFloat(scan[i+1]));
                                break;
                        }
                    }
                    break;
                case "car":
                    switch (scan[1]){
                        case "kia":
                            car = new Car()
                                    .addDrivePanel(new DrivePanel())
                                    .addEngine(new Engine()
                                            .setFuelType("Gasoline")
                                            .setPiston(new Piston()))
                                    .addWheel(new Wheel(0.64f, 0.12f, "rust"))
                                    .addSeat(new Seat("nylon", "pillow", 1, new float[]{107, 50, 110}))
                                    .addWindow(new Window());
                            System.out.println(car.toString());
                            break;
                        case "hyundai":
                            car = new Car()
                                    .addDrivePanel(new DrivePanel())
                                    .addEngine(new Engine()
                                            .setFuelType("Gasoline")
                                            .setPiston(new Piston()))
                                    .addWheel(new Wheel(0.72f, 0.16f, "rust"))
                                    .addSeat(new Seat("leather", "pillow", 1, new float[]{108, 47, 123}))
                                    .addWindow(new Window());
                            System.out.println(car.toString());
                    }

                    break;
                case "help":
                    System.out.println();

            }
        }
    }
}
