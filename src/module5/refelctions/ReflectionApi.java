package module5.refelctions;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionApi {
    public static void main(String[] args) throws Exception {
        Class<MyClass> classz = (Class<MyClass>) Class.forName("module5.refelctions.MyClass");
        Constructor<MyClass> declaredConstructor = classz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        MyClass o = declaredConstructor.newInstance();
        Class<? extends MyClass> aClass = o.getClass();
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
