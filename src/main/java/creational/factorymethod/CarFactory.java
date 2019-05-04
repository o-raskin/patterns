package creational.factorymethod;

import creational.abstractfactory.car.Car;

public interface CarFactory {

    /*
     *  Factory method
     */
    Car createCar();
}
