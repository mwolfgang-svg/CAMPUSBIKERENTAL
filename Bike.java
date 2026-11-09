/** Represents one bike in the campus rental system. */
public class Bike {
    private int id;
    private String model;
    private boolean available;


    public Bike(int id, String model) {
        this.id = id;
        this.model = model;
        available = true;

    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return available;
    }

    public void rent() {
        available = false;
    }

    public void returnBike() {
        available = true;
    }
}
