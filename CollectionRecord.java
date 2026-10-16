import java.util.ArrayList;
import java.util.List;

class CollectionRecord {
    String location;
    int wasteLevel;
    boolean completed;

    CollectionRecord(String location, int wasteLevel,
                     boolean completed) {//CO6
        this.location = location;
        this.wasteLevel = wasteLevel;
        this.completed = completed;
    }
}//CO6

public class Module6 {
    public static void main(String[] args) {//CO6

        ArrayList<CollectionRecord> records = new ArrayList<>();

        records.add(new CollectionRecord("Bowrampet", 92, true));
        records.add(new CollectionRecord("Bachupally", 65, false));
        records.add(new CollectionRecord("Miyapur", 45, true));
        records.add(new CollectionRecord("Nizampet", 85, true));

        // Use streams to count completed collections
        long completedCount = records.stream()
            .filter(r -> r.completed)
            .count();

        // Use a lambda expression to display high-priority points
        System.out.println("High-Priority Collection Points:");

        records.stream()
            .filter(r -> r.wasteLevel >= 80)
            .forEach(r -> System.out.println(r.location));

        // Calculate average waste level using a stream
        double average = records.stream()
            .mapToInt(r -> r.wasteLevel)
            .average()
            .orElse(0.0);

        System.out.println("\nDAILY PERFORMANCE REPORT");
        System.out.println("Total Collection Points: " + records.size());
        System.out.println("Completed Collections: " + completedCount);
        System.out.println(
            "Pending Collections: " +
            (records.size() - completedCount)
        );
        System.out.printf("Average Waste Level: %.2f%%%n", average);
    }
}