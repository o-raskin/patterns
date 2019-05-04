package creational.abstractfactory;

import creational.abstractfactory.car.Car;
import creational.abstractfactory.car.Porsche;
import creational.abstractfactory.phone.Phone;
import creational.abstractfactory.phone.PorschePhone;

public class PorscheFactory implements AbstractFactory {

    public Phone createPhone() {
        return new PorschePhone();
    }

    public Car createCar() {
        return new Porsche();
    }
}
