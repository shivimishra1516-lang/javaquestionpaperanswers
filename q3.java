 class Main {

    public static void main(String[] args) {

        ParkingArea v1 = new ParkingArea();
        v1.vehicleNo = "UP11K2026";
        v1.start();

        ParkingArea v2 = new ParkingArea();
        v2.vehicleNo = "UK08K2020";
        v2.start();
    }
}

class ParkingArea extends Thread {

    String vehicleNo;

    static int availableSlots = 1;

    static synchronized void parkVehicle(String vehicleNo) {

        if (availableSlots > 0) {

            System.out.println(vehicleNo + " booked a parking slot.");

            availableSlots--;
        }
        else {
            System.out.println("No parking slot available for " + vehicleNo);
        }
    }

    public void run() {

        parkVehicle(vehicleNo);
    }
}