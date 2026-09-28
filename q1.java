 class Main {
    public static void main(String[] args) {

        Spacecraft s = new Spacecraft();

        s.distance = 10;
        s.fuelEfficiency = 0;

        s.calculateFuel();
    }
}

class Spacecraft {

    double distance;
    double fuelEfficiency;

    void calculateFuel() {

        try {
            if (fuelEfficiency == 0) {
                throw new ArithmeticException();
            }

            double fuel = distance / fuelEfficiency;
            System.out.println("Required Fuel: " + fuel);
        }
        catch (ArithmeticException e) {
            System.out.println("Invalid fuel efficiency!");
        }
    }
}