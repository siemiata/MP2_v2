import java.util.Date;

public class Order {
    public Date orderDate;
    public float orderPrice;
    public Owner owner;
    public Car car;

    public Order(Date orderDate, float orderPrice, Owner owner, Car car) {
        this.orderDate = orderDate;
        this.orderPrice = orderPrice;
        this.owner = owner;
        this.car = car;
    }
}
