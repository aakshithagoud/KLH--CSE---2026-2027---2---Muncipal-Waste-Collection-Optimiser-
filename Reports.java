import java.util.ArrayList;

class WasteRecord {
    String location;
    int wasteLevel;
    boolean completed;

    WasteRecord(String location, int wasteLevel,
                boolean completed) {
        this.location = location;
        this.wasteLevel = wasteLevel;
        this.completed = completed;
    }
}

public class Reports {//CO6
    public static void main(String[] args) {//CO6

        ArrayList<WasteRecord> records = new ArrayList<>();

        records.add(new WasteRecord("Bowrampet", 90, true));
        records.add(new WasteRecord("Bachupally", 60, false));
        records.add(new WasteRecord("Miyapur", 40, true));
        records.add(new WasteRecord("Nizampet", 85, true));
        records.add(new WasteRecord("Kukatpally", 75, false));

        // Count completed collections using streams
        long completedCount = records.stream()
            .filter(r -> r.completed)
            .count();

        // Display high-priority locations using a lambda
        System.out.println("HIGH-PRIORITY LOCATIONS:");

        records.stream()
            .filter(r -> r.wasteLevel >= 80)
            .forEach(r -> System.out.println(r.location));

        // Calculate average waste level
        double averageWaste = records.stream()
            .mapToInt(r -> r.wasteLevel)
            .average()
            .orElse(0.0);

        // Display the report
        System.out.println("\nDAILY PERFORMANCE REPORT");
        System.out.println("------------------------");
        System.out.println(
            "Total Collection Points: " + records.size()
        );
        System.out.println(
            "Completed Collections: " + completedCount
        );
        System.out.println(
            "Pending Collections: " +
            (records.size() - completedCount)
        );
        System.out.printf(
            "Average Waste Level: %.2f%%%n",
            averageWaste
        );
    }//CO6
}