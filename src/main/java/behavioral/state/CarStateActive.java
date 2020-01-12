package behavioral.state;

public class CarStateActive extends CarState {

    public CarStateActive(Car car) {
        super.car = car;
    }

    @Override
    public void ride() {
        System.out.println("Already started");
    }

    @Override
    public void stop() {
        System.out.println("Stopping car...");
        CarStateInactive inactive = new CarStateInactive(car);
        car.setState(inactive);
    }
}