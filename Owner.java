import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Owner {
    public String name;
    public String surname;
    public ArrayList<Car> cars;
    public ArrayList<Order> orders;
    private Map<String, Car> carsQua;

    public Owner(String name, String surname, ArrayList<Car> cars, ArrayList<Order> orders,Map<String, Car> carsQua) {
        this.name = name;
        this.surname = surname;
        this.cars = cars;
        this.orders = orders;
        this.carsQua = carsQua;
    }

    public void addCar(String licensePlate, Car car) {
        carsQua.put(licensePlate, car);
    }

    public void removeCar(String licensePlate) {
        cars.remove(licensePlate);
    }

    public void displayCars() {
        for (String licensePlate : carsQua.keySet()) {
            Car car = carsQua.get(licensePlate);
            System.out.println(licensePlate + ": " + car.getBrand() + " " + car.getModel());
        }
    }

}
