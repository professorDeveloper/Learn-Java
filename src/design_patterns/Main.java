package design_patterns;

import design_patterns.builder.Employee;
import design_patterns.factory_method.FactoryMethod;
import design_patterns.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        String str = String.valueOf(2255);
        FactoryMethod fm = FactoryMethod.getInstance();
        FactoryMethod fm2 = FactoryMethod.getInstance();
        Employee emp = new Employee.EmployeeBuilder().id("1").firstName("John").lastName("Doe").build();
        System.out.println(emp);
        System.out.println(System.identityHashCode(fm2));
        System.out.println(System.identityHashCode(Singleton.getInstance()));
        System.out.println(System.identityHashCode(Singleton.getInstance()));
    }
}
