package design_patterns;

public class FactoryMethod {
    private FactoryMethod() {
        System.out.println("Calling private constructor");
    }

    public static FactoryMethod getInstance() {
        return new FactoryMethod();
    }

}
