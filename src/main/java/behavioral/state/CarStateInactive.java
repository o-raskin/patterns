package behavioral.state;

public class CarStateInactive extends CarState {

    public CarStateInactive(Car car) {
        super.car = car;
    }

    @Override
    public void ride() {
        System.out.println("Starting car...");
        CarStateActive inactive = new CarStateActive(car);
        car.setState(inactive);
    }

    @Override
    public void stop() {
        System.out.println("Already stopped");
    }
}
