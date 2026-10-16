class RoutePlanner1;
    private double[] distances;

    RoutePlanner(String startingPoint, double[] distances) {
        if (startingPoint == null || startingPoint.isEmpty()) {
            throw new IllegalArgumentException(
                "Starting point cannot be empty"
            );
        }

        if (distances == null) {
            throw new IllegalArgumentException(
                "Distance data is missing"
            );
        }

        for (double d : distances) {
            if (d < 0 || Double.isNaN(d)
                    || Double.isInfinite(d)) {
                throw new IllegalArgumentException(
                    "Distance must be valid and non-negative"
                );
            }
        }

        this.startingPoint = startingPoint;
        this.distances = distances.clone();
    }

    double calculateDistance() {
        double total = 0;

        for (double d : distances) {
            total += d;
        }

        return total;
    }

    void displayRoute() {
        System.out.println("Starting Point: " + startingPoint);
        System.out.printf(
            "Total Route Distance: %.2f km%n",
            calculateDistance()
        );
    }
}

public class RoutePlanner {
    public static void main(String[] args) {
        try {
            double[] distances = {3.0, 2.5, 4.5};

            RoutePlanner route =
                new RoutePlanner("Municipal Depot", distances);

            route.displayRoute();

        } catch (IllegalArgumentException e) {
            System.out.println("Route Error: " + e.getMessage());
        }
    }
}
