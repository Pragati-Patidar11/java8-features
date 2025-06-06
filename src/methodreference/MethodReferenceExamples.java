package methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceExamples {

    public void staticReference() {
        Consumer<String> staticRef = Utils::printMessage;
        staticRef.accept("static method reference!");
    }

    public void instanceReference() {
        Utils utils = new Utils();
        Consumer<String> instanceRef = utils::printUpperCase;
        instanceRef.accept("instance method reference!");
    }

    public void arbitraryObjectReference() {
        List<String> names = Arrays.asList("Java", "Python", "Flutter");
        names.forEach(System.out::println);
        names.stream().map(String::toLowerCase).forEach(System.out::println);
    }

    public void constructorReference() {
        Supplier<Employee> defaultEmpSupplier = Employee::new;
        Employee defaultEmp = defaultEmpSupplier.get();
        defaultEmp.display();

        Function<String, Employee> empCreator = Employee::new;
        Employee emp = empCreator.apply("Pragati");
        emp.display();
    }
}

