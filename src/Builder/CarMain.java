package Builder;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        Engine engine;
        Scanner scanner = new Scanner(System.in);

        String action = "";
        String[] scan;

        while (!action.equals("exit")) {
            scan = scanner.nextLine().split(" ");
            action = scan[0];
            switch (action) {
                case "engine":
                    engine = new Engine(Integer.parseInt(scan[1]), scan[2], Float.parseFloat(scan[3]));
                    if (scan[4].equals("RPM")) {
                        engine.setRPM(Integer.parseInt(scan[5]));
                        System.out.println("write distance:");
                        int dist = scanner.nextInt();
                        System.out.println("Time per km: " + engine.getWorkTime(dist) + " seconds");
                        System.out.println("Energy consumtion is: " + engine.calculateEnergyPerKm()+ " MJ");
                    }
            }
        }
    }
}
