package behavioral.templatemethod;

public class ProcessorImplA extends Processor {

    @Override
    protected void step2() {
        System.out.println("A variant STEP 2");
    }
}
