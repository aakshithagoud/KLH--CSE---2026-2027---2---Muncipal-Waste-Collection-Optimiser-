import java.util.Arrays;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Module5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vehicleIds = {"WV103", "WV101", "WV102"};
        int[] capacities = {800, 1000, 500};

        // Sort vehicle IDs using a library method
        Arrays.sort(vehicleIds);

        System.out.println("Available Vehicle IDs:");
        for (String id : vehicleIds) {//CO5
            System.out.println(id);
        }

        System.out.print("Enter vehicle ID to search: ");
        String searchId = sc.nextLine().trim();

        int found = -1;

        // Search for the requested vehicle
        for (int i = 0; i < vehicleIds.length; i++) {
            if (vehicleIds[i].equalsIgnoreCase(searchId)) {
                found = i;
                break;
            }
        }

        String result;

        if (found != -1) {//CO5
            result = "Vehicle found: " + vehicleIds[found];
        } else {
            result = "Vehicle not found.";
        }

        System.out.println(result);

        // Save search result to a file
        try (FileWriter writer =
                 new FileWriter("assignment_log.txt")) {
            writer.write(result);
            writer.write(System.lineSeparator());
            System.out.println("Result saved to assignment_log.txt");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        sc.close();
    }
}