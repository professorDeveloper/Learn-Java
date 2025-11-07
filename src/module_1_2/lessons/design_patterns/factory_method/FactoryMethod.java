package module_1_2.lessons.design_patterns.factory_method;

public class FactoryMethod {
    private FactoryMethod() {
        System.out.println("Calling private constructor");
    }

    public static FactoryMethod getInstance() {
        return new FactoryMethod();
    }

}
