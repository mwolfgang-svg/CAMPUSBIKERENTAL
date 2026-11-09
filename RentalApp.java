/** Client program for the campus bike rental system. */
public class RentalApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Campus Bike Rental System!");
    
        // TODO 1: Create two RentalStation objects.
        RentalStation station1 = new RentalStation("Athletic Center");
        RentalStation station2 = new RentalStation("Health Center");
        

        // TODO 2: Create at least three Bike objects.
        Bike bike1 = new Bike(1, "Mountain Bike");
        Bike bike2 = new Bike(2, "Street Bike");
        Bike bike3 = new Bike(3, "Track Bike");
        Bike bike4 = new Bike(4, "Unicycle");
        // TODO 3: Rent a bike from the first station.
        station1.rentBike(bike1);

        // TODO 4: Attempt to rent the same bike again.
        station1.rentBike(bike1);

        // TODO 5: Rent a different bike from the second station.
        station2.rentBike(bike4);

        // TODO 6: Return the first bike and rent it again.
        station1.returnBike(bike1);
        station1.rentBike(bike1);
        // TODO 7: Print the cost of a three-hour rental.
        System.out.println("Cost for 3-hour rental: $" + station1.calculateCost(3));

        // TODO 8: Print the total successful rentals using
        //         RentalStation.getTotalRentals().
        System.out.println("Total successful rentals: " + RentalStation.getTotalRentals());
    }
}

/*
PART D — Written Responses

1. Why is totalRentals static, but name is not?
Answer:

2. What would happen if totalRentals were not static?
Answer:

3. When rentBike(Bike bike) is called, is a new Bike object created? Explain.
Answer:

4. Why is HOURLY_RATE declared final?
Answer:
*/
