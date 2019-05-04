package creational.abstractfactory;

public class Application {


    /*
     *      AbstractFactory - Client code
     *
     *      Creating families of related or dependent products.
     */
    public static void main(String[] args) throws Exception {

        // arrange
        String input = "Porsche";
        AbstractFactory abstractFactory;
        if ("Apple".equals(input)) {
            abstractFactory = new AppleFactory();
        } else if ("Porsche".equals(input)) {
            abstractFactory = new PorscheFactory();
        } else {
            throw new Exception("");
        }


        // act
        abstractFactory.createCar().drive();
        abstractFactory.createPhone().call("911");
    }
}
