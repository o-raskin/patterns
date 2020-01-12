package behavioral.templatemethod;

public class Application {

    /*
     * Template method
     *
     * Definition algorithm structure and delegate implementation of 'steps' to subclasses.
     **/
    public static void main(String[] args) {

        Processor processor;

        processor = new ProcessorImplA();
        processor.process();

        System.out.println("\n=== end ===\n");

        processor = new ProcessorImplB();
        processor.process();

    }
}
