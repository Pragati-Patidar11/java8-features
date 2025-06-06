package functionalinterfaces;

public class FunctionalInterfaceExamples {
    public void runAllExamples() {
        PredicateExample.checkEmail("radhikajain12@gmail.com");
        FunctionExample.convertToUpper("java8 features");
        ConsumerExample.printMessage("Learning Functional Interfaces");
        SupplierExample.generateId();

        BiConsumerExample.printDetails("Radhika", 28);
    }
}

