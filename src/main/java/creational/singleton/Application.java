package creational.singleton;

import creational.factorymethod.AppleFactory;
import creational.factorymethod.CarFactory;
import creational.factorymethod.PorscheFactory;

public class Application {


    /*
     *      Singleton - Client code
     *
     *      Have only 1 instance of some class.
     */
    public static void main(String[] args) throws Exception {

        SimpleSingleton simpleSingleton1 = SimpleSingleton.getInstance();
        SimpleSingleton simpleSingleton2 = SimpleSingleton.getInstance();

        DoubleCheckingSingleton doubleCheckingSingleton1 = DoubleCheckingSingleton.getInstance();
        DoubleCheckingSingleton doubleCheckingSingleton2 = DoubleCheckingSingleton.getInstance();

    }
}
