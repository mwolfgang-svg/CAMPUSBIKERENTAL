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
        Bike bike3 = new Bike(3, "Unicycle");
        // TODO 3: Rent a bike from the first station.
        station1.rentBike(bike1);

        // TODO 4: Attempt to rent the same bike again.
        station1.rentBike(bike1);

        // TODO 5: Rent a different bike from the second station.
        station2.rentBike(bike3);

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
Answer: totalRentals is static because it is shared by all RentalStation objects and keeps track of the total number of rentals in the entire system. name is not static because each rental station has its own unique name.

2. What would happen if totalRentals were not static?
Answer: Each RentalStation object would have its own separate copy of totalRentals. The program would not be able to keep track of the total rentals across all stations, only the rentals at each individual station.

3. When rentBike(Bike bike) is called, is a new Bike object created? Explain.
Answer: No. A new Bike object is not created. The method receives a reference to an existing Bike object and operates on that same object. For example, it may change the bike's availability from available to rented.

4. Why is HOURLY_RATE declared final?
Answer: HOURLY_RATE  is final because it is a fixed price, meaning the hourly rate will not change unless the owner decides to. So the program should also not change the value.
*/
