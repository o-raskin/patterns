package creational.abstractfactory;

import creational.abstractfactory.car.AppleCar;
import creational.abstractfactory.car.Car;
import creational.abstractfactory.phone.Iphone;
import creational.abstractfactory.phone.Phone;

public class AppleFactory implements  AbstractFactory{

    public Phone createPhone() {
        return new Iphone();
    }

    public Car createCar() {
        return new AppleCar();
    }
}
