package stuctural.facade;

import stuctural.bridge.Black;
import stuctural.bridge.Color;
import stuctural.bridge.Shape;
import stuctural.bridge.Square;

public class Application {

    /*
     *      Facade - Client code
     *
     *      Provide simple interface to complex set of classes, framework or library.
     *      Facade CREATE new interface, when Adapter use existing to implements API connectivity.
     *
     */
    public static void main(String[] args) {

        // arrange
        // init facade someway and use it.
        Facade facade = new FacadeImpl(new ExternalComplexClassA(), new ExternalComplexClassB());

        // act
        facade.simpleMethod();
    }
}
