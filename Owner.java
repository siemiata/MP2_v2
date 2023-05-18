import java.util.ArrayList;
import java.util.List;

public class Owner {
    public String name;
    public String surname;
    public ArrayList<Car> cars;
    public ArrayList<Order> orders;

    public Owner(String name, String surname, ArrayList<Car> cars, ArrayList<Order> orders) {
        this.name = name;
        this.surname = surname;
        this.cars = cars;
        this.orders = orders;
    }
}
