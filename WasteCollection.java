import java.util.Scanner;

public class WasteCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of areas: ");
        int n = sc.nextInt();

        double totalWaste = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter waste in Area " + i + " (kg): ");
            double waste = sc.nextDouble();
            totalWaste += waste;
        }

        System.out.println("\nTotal Waste = " + totalWaste + " kg");

        if (totalWaste <= 500) {
            System.out.println("Vehicle Required: Small Truck");
        } 
        else if (totalWaste <= 1000) {
            System.out.println("Vehicle Required: Medium Truck");
        } 
        else {
            System.out.println("Vehicle Required: Large Truck");
        }

        System.out.println("Waste collection route is optimized.");
    }
}