package creational.prototype;


public class Application {


    /*
     *      Prototype - Client code
     *
     *      Need, when we need to copy object, but we can't or don't want to look at implementation of class.
     *      Implements in Java by using interface Cloneable in necessary .
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("A8");
        System.out.println("CAR1 MODEL: " + car.getModel());
        Car car2 = car.clone();
        System.out.println("CAR2 MODEL: " + car2.getModel());

        System.out.println("--- CHANGE MODEL OF CAR1 ---");
        car.setModel("123");
        System.out.println("CAR1 MODEL: " + car.getModel());
        System.out.println("CAR2 MODEL: " + car2.getModel());
    }
}
