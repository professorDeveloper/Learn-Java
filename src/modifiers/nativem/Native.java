package modifiers.nativem;

public class Native {

    public native void sayHello();

    static {
        System.load("C:\\Users\\azamo\\IdeaProjects\\Learn-Java\\cpp\\nativeexample.dll");
    }

    public static void main(String[] args) {
        new Native().sayHello();
    }
}