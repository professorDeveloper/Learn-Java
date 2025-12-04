package module3.lesson.collections.generics.bounds;

public class TypeVariableBounds<T extends Number> {
    private final T field;

    public TypeVariableBounds(T field) {
        this.field = field;
    }
}

interface CanConnectToDatabase {
}

class Repository implements CanConnectToDatabase {
}

class Service<R extends CanConnectToDatabase> {
    private final R repository;

    Service(R repository) {
        this.repository = repository;
    }
}

class TypeVariableBoundsTest {
    public static void main(String[] args) {
        var t = new TypeVariableBounds<Integer>(12);
        var t2 = new TypeVariableBounds<>(12L);
        var t3 = new TypeVariableBounds<>(12.0);
        var service = new Service<>(new Repository());
    }
}
