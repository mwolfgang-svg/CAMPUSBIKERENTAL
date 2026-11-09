/** A station that rents Bike objects. */
public class RentalStation {

    private static int totalRentals = 0;
    public static final double HOURLY_RATE = 5.00;
    private String name;

    public RentalStation(String name) {
        this.name = name;
    }

    public void rentBike(Bike bike) {
        if(bike.isAvailable()){
            bike.rent();
            totalRentals++;
            System.out.println("Bike " + bike.getId() + " rented from " + name + ".");
        } else {
            System.out.println("Bike " + bike.getId() + " is already rented");
        }
    }

    public void returnBike(Bike bike) {
        bike.returnBike();
        System.out.println("Bike " + bike.getId() + " was returned to " + name + ".");
    }

    public double calculateCost(int hours) {
        return hours * HOURLY_RATE;
    }

    public static int getTotalRentals() {
        return totalRentals;
    }
}
