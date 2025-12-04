package module3.lesson.collections.generics.bounds;

interface B1 {
}

interface B2 {
}

class A<E extends B1 & B2> {

}
class B implements B1,B2{

}
class C1 implements B1{

}
class C2 implements B2{

}
class C3 implements B1,B2{

}
public class MultipleBounds {
    public static void main(String[] args) {
        A<B> a = new A<>();
        A<C3> a2 = new A<>();
    }
}
