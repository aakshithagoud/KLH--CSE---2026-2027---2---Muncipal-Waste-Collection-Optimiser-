
import java.util.Scanner;
public class  CollectionPoint  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Point ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Location: ");
        String location = sc.nextLine();
        System.out.print("Enter Waste Type: ");
        String wasteType = sc.nextLine();

        System.out.print("Enter Waste Level (0-100): ");
        int wasteLevel = sc.nextInt();

        if (wasteLevel < 0 || wasteLevel > 100) { //CO1
            System.out.println("Invalid waste level!");
        } else {
            int remainingCapacity = 100 - wasteLevel;

            System.out.println("\n--- Collection Point Details ---");
            System.out.println("Point ID: " + id);
            System.out.println("Location: " + location);
            System.out.println("Waste Type: " + wasteType);
            System.out.println("Waste Level: " + wasteLevel + "%");

            if (wasteLevel >= 80) { //CO1
                System.out.println("Collection Required");
            } else {
                System.out.println("Collection Not Required");
            }

            System.out.println(
                "Remaining Capacity: " + remainingCapacity + "%"
            );
        }

        sc.close();
    }
}
