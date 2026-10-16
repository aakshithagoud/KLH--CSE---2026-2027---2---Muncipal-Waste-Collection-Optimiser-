public class WasteCollectionReport {
    static int countCompleted(boolean[] completed) {
        int count = 0;
        for (int i = 0; i < completed.length; i++) {
            if (completed[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) { //CO6
        boolean[] completed = {true, false, true, true, false};
        double[] distances = {5.5, 3.0, 4.5, 6.0, 2.0};
        double[] fuel = {1.2, 0.8, 1.0, 1.5, 0.5};
        int completedStops = countCompleted(completed);
        double totalDistance = 0;
        double totalFuel = 0;
        for (int i = 0; i < completed.length; i++) { //CO6
            if (completed[i]) { //CO6
                totalDistance += distances[i];
                totalFuel += fuel[i];
            }
        }

        // Display daily performance summary
        System.out.println("==================================");
        System.out.println(" MUNICIPAL WASTE COLLECTION REPORT");
        System.out.println("==================================");

        System.out.println("Total Collection Stops: " + completed.length);
        System.out.println("Completed Stops: " + completedStops);
        System.out.println("Pending Stops: " +
                (completed.length - completedStops));

        System.out.printf("Total Distance Travelled: %.2f km%n",
                totalDistance);

        System.out.printf("Estimated Fuel Consumed: %.2f litres%n",
                totalFuel);

        System.out.println("==================================");
        System.out.println("Daily Report Generated Successfully!");
    }
}