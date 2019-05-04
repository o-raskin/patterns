package creational.abstractfactory;

import creational.abstractfactory.car.Car;
import creational.abstractfactory.phone.Phone;

public interface AbstractFactory {

    Phone createPhone();

    Car createCar();

}
