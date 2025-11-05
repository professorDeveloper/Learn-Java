package lessons.inner_class.task3;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent.TopLevel topLevel = new Parent.TopLevel();
        Parent.NestedNormal nestedNormal = parent.new NestedNormal();
        topLevel.helper();
        nestedNormal.helper();
        System.out.println("Hello world");
    }
}
