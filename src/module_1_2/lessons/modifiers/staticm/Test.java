package module_1_2.lessons.modifiers.staticm;

public class Test {
    /*
     * class
     * method
     * variable
     * */
    public static String field;

    public void greeting() {
        System.out.println("Hello ");
    }

    public static class InnerClass {

    } // Static inner class mustaqil class ham deyiladi.
}

class Main {
    public static void main(String[] args) {
//        Test test = new Test();
//        Test test2 = new Test();
//        Test test3 = new Test();
//        Test test4 = new Test();
//        test.greeting();
//        System.out.println(test.field);
//        System.out.println(test2.field);
//        System.out.println(test3.field);
//        System.out.println(test4.field);
        System.out.println(Test.field="Hello");

    }
}
