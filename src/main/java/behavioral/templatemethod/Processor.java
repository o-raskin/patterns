package behavioral.templatemethod;

public abstract class Processor {

    // this is the 'template method' as it is
    public void process() {
        step1();
        step2();
        step3();
    }

    private void step1() {
        System.out.println("Required STEP 1 completed!");
    }

    protected abstract void step2();

    private void step3() {
        System.out.println("Required STEP 2 completed!");
    }
}
