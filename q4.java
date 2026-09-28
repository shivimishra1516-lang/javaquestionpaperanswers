 class q4 {

     static void main(String[] args) {

        EVVehicle v1 = new EVVehicle(1, "Nexon", 78);
        EVVehicle v2 = new EVVehicle(2, "Brezza", 50);

        System.out.println("Station: " + EVVehicle.stationName);

        System.out.println(
            v1.getRegistrationNo() + " " +
            v1.getModel() + " " +
            v1.getBatteryPercentage()
        );

        System.out.println("Total Vehicles: " + EVVehicle.vehicleCount);
    }
}

class EVVehicle {

    private int registrationNo;
    private String model;
    private int batteryPercentage;

    static int vehicleCount = 0;

    final static String stationName = "GreenCharge EV Station";

    // Parameterized constructor
    EVVehicle(int registrationNo, String model, int batteryPercentage) {

        this.registrationNo = registrationNo;
        this.model = model;
        this.batteryPercentage = batteryPercentage;

        vehicleCount++;
    }

    // Getter
    public int getRegistrationNo() {
        return registrationNo;
    }

    // Setter
    public void setRegistrationNo(int registrationNo) {
        this.registrationNo = registrationNo;
    }

    // Getter
    public String getModel() {
        return model;
    }

    // Setter
    public void setModel(String model) {
        this.model = model;
    }

    // Getter
    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    // Setter
    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }
}