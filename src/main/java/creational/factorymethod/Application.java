package creational.factorymethod;

public class Application {


    /*
     *      FactoryMethod - Client code
     *
     *      Used to create 1 product only.
     */
    public static void main(String[] args) throws Exception {

        // arrange
        String input = "Porsche";

        CarFactory carFactory;
        if ("Apple".equals(input)) {
            carFactory = new AppleFactory();
        } else if ("Porsche".equals(input)) {
            carFactory = new PorscheFactory();
        } else {
            throw new Exception("");
        }


        // act
        // use factory method then 'drive()'
        carFactory.createCar().drive();
    }
}
