public class CollectionScheduling {

    static String getPriority(int wasteLevel) {//CO3
        if (wasteLevel >= 80)
            return "HIGH";
        else if (wasteLevel >= 50)
            return "MEDIUM";
        else
            return "LOW";
    }

    // Recursive method to count high-priority points
    static int countHighPriority(int[] levels, int index) {
        if (index == levels.length)
            return 0;

        int count = levels[index] >= 80 ? 1 : 0;

        return count + countHighPriority(levels, index + 1);
    }

    public static void main(String[] args) {//CO3
        String[] locations = {
            "Bowrampet", "Bachupally", "Miyapur", "Nizampet"
        };

        int[] levels = {92, 65, 45, 85};

        // Columns: point number and waste level
        int[][] schedule = {//CO3
            {1, 92},
            {2, 65},
            {3, 45},
            {4, 85}
        };

        System.out.println("COLLECTION SCHEDULE");

        for (int i = 0; i < locations.length; i++) {
            System.out.println(
                locations[i] + " - " + schedule[i][1] + "% - "
                + getPriority(levels[i])
            );
        }

        System.out.println(
            "High-priority points: "
            + countHighPriority(levels, 0)
        );
    }
}