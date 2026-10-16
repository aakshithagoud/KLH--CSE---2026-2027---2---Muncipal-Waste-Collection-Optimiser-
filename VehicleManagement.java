
import java.util.Scanner;
public class VehicleManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of vehicles.");
            sc.close();
            return;
        }

        int suitable = 0;

        for (int i = 1; i <= n; i++) {//CO2
            System.out.println("\nVehicle " + i);

            System.out.print("Enter vehicle capacity (kg): ");
            int capacity = sc.nextInt();

            System.out.print("Is vehicle available? (true/false): ");
            boolean available = sc.nextBoolean();

            System.out.print("Enter waste load (kg): ");
            int load = sc.nextInt();

            if (capacity <= 0 || load <= 0) { //CO2
                System.out.println("Invalid capacity or load.");
            } else if (available && load <= capacity) {
                System.out.println("Vehicle is suitable.");
                suitable++;
            } else {
                System.out.println(
                    "Vehicle unavailable or capacity too small."
                );
            }
        }

        System.out.println("\nSuitable vehicles: " + suitable);
        sc.close();
    }
}
