import java.util.ArrayList;
import java.util.List;

public class Car {
    public String brand;
    public String model;
    public Owner owner;
    public ArrayList<Order> orders;

    public Car(String brand, String model, Owner owner, ArrayList<Order> orders) {
        this.brand = brand;
        this.model = model;
        this.owner = owner;
        this.orders = orders;
    }
}
