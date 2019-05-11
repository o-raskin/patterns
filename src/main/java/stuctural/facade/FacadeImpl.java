package stuctural.facade;

public class FacadeImpl implements Facade{

    private ExternalComplexClassA classA;
    private ExternalComplexClassB classB;

    // manually or with IoC create object with dependencies.
    public FacadeImpl(ExternalComplexClassA classA, ExternalComplexClassB classB) {
        this.classA = classA;
        this.classB = classB;
    }

    /*
    *   Just implement method(s), which work with complex interfaces.
    *   When external classes will changed, we can configure connect point of program in 1 place.
    * */
    public void simpleMethod() {
        classA.complexMethodA();
        classB.complexMethodB();
    }
}
