package behavioral.state;

public class Application {

    /*
     * State
     *
     * Objects change behavior based on inner state.
     **/
    public static void main(String[] args) {

        Car car = new Car();

        car.ride();
        car.ride();

        car.stop();
        car.stop();

        car.ride();
        car.stop();
    }
}
