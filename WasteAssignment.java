class WasteVehicle {
    String vehicleId;
    int capacity;
    boolean available;
    WasteVehicle(String vehicleId, int capacity, boolean available) {
        this.vehicleId = vehicleId;
        this.capacity = capacity;
        this.available = available;
    }
    boolean canCollect(int loadKg) { //CO5
        return available && loadKg <= capacity;
    }

    String getVehicleId() { //CO5
        return vehicleId;
    }
}

public class WasteAssignment { //CO5
    static void assignVehicle(WasteVehicle vehicle, int loadKg) {
        try {
            if (loadKg <= 0) {
                throw new IllegalArgumentException(
                    "Load must be positive"
                );
            }

            if (vehicle == null) {
                throw new IllegalArgumentException(
                    "Vehicle details are missing"
                );
            }

            if (vehicle.canCollect(loadKg)) {
                System.out.println(
                    "Vehicle assigned: " + vehicle.getVehicleId()
                );
            } else {
                System.out.println(
                    "Vehicle unavailable or capacity too small"
                );
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        WasteVehicle v1 = new WasteVehicle("WV101", 1000, true);
        WasteVehicle v2 = new WasteVehicle("WV102", 500, false);
        WasteVehicle v3 = new WasteVehicle("WV103", 800, true);
        System.out.println("MUNICIPAL WASTE VEHICLE ASSIGNMENT");
        System.out.println("----------------------------------");

        assignVehicle(v1, 700);
        assignVehicle(v2, 300);
        assignVehicle(v3, 1000);
        assignVehicle(v1, -100);
        assignVehicle(v3, 0);
    }
}