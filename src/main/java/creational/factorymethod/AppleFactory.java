package creational.factorymethod;

import creational.abstractfactory.car.AppleCar;
import creational.abstractfactory.car.Car;

public class AppleFactory implements CarFactory {

    public Car createCar() {
        return new AppleCar();
    }
}
