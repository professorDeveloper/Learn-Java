package module3.lesson.solid.interface_segregation;

public interface A {
    void m1();

}

interface A2 {
    void m2();
}

interface A3 {
    void m3();
}

class AImpl implements A, A2, A3 {
    @Override
    public void m1() {
    }

    @Override
    public void m2() {
    }

    @Override
    public void m3() {
    }
}

class B implements A, A2 {
    @Override
    public void m1() {
    }

    @Override
    public void m2() {
    }
}