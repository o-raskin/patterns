package creational.builder;

import creational.builder.simple.Car;

public class Application {


    /*
     *      Builder - Client code
     *
     *      Need to create object with step-by-step setting a lot of fields.
     */
    public static void main(String[] args) {
        Car simpleCar = new Car.Builder("A7")       //  required field
                .setColor("RED")                           //  optional field
                .build();

    }
}
