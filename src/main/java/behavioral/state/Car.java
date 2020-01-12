package behavioral.state;

public class Car {

    private CarState state;

    public Car() {
        this.state = new CarStateInactive(this);
    }

    public void setState(CarState state) {
        this.state = state;
    }

    public void ride() {
        state.ride();
    }

    public void stop() {
        state.stop();
    }
}
