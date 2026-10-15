import java.util.Scanner;
public class RouteOptimisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of collection points: ");
        int n = sc.nextInt();
        int[][] distance = new int[n][n];
        boolean[] visited = new boolean[n];
        System.out.println("Enter the distance matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                distance[i][j] = sc.nextInt();
            }
        }

        int current = 0;
        int totalDistance = 0;
        visited[current] = true;
        System.out.print("Visit Order: Depot");
        for (int count = 1; count < n; count++) {
            int nearest = -1;
            int minDistance = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (!visited[j] &&
                    distance[current][j] < minDistance) {
                    minDistance = distance[current][j];
                    nearest = j;
                }
            }
            visited[nearest] = true;
            totalDistance += minDistance;
            current = nearest;
            System.out.print(" -> Location " + current);
        }
        totalDistance += distance[current][0];

        System.out.println(" -> Depot");
        System.out.println("Estimated Total Distance: "
                + totalDistance);

        sc.close();
    }
}