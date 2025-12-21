package module5.refelctions;

import java.lang.reflect.Constructor;

public class ReflectionApi {
    public static void main(String[] args) throws Exception {
        Class<MyClass> classz = (Class<MyClass>) Class.forName("module5.refelctions.MyClass");
        Constructor<MyClass> declaredConstructor = classz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        MyClass o = declaredConstructor.newInstance();
        o.test();
    }
}
