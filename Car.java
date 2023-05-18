import java.util.*;

public class Car {
    public String brand;
    public String model;
    public int vinNumber;
    public Owner owner;
    public ArrayList<Order> orders;
    private List<Engine> engines = new ArrayList<>();
    private static Set<Engine> allEngines = new HashSet<>();

    public Car(String brand, String model, Owner owner, ArrayList<Order> orders, int vinNumber) {
        this.brand = brand;
        this.model = model;
        this.owner = owner;
        this.orders = orders;
        this.vinNumber = vinNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void addEngine(Engine engine) throws Exception {
        if (!engines.contains(engine)) {
            engines.add(engine);

            if (allEngines.contains(engine)) {
                throw new Exception("Engine is already connected with a Car! ");
            }
            engines.add(engine);
            allEngines.add(engine);
        }
    }

}
