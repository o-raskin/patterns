package creational.factorymethod;

import creational.abstractfactory.car.Car;
import creational.abstractfactory.car.Porsche;

public class PorscheFactory implements CarFactory{

    public Car createCar() {
        return new Porsche();
    }
}
