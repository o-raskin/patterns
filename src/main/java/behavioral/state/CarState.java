package behavioral.state;

public abstract class CarState {

    protected Car car;

    abstract void ride();

    abstract void stop();
}
