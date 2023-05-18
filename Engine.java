public class Engine {
    public String fuelType;
    public float engineCapacity;
    private Car car;

    private Engine(String fuelType, float engineCapacity, Car car) {
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.car = car;
    }

    public static Engine createEngine(String fuelType, float engineCapacity, Car car) throws Exception{
        if (car == null){
            throw new Exception("Given car does not exists");
        }
        Engine engine = new Engine(fuelType, engineCapacity, car);
        car.addEngine(engine);
        return engine;
    }
}
