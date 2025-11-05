package lessons.inner_class;

public class Statistic {
    public static void main(String[] args) {
        StaticNestedInnerClass.Session session = new StaticNestedInnerClass.Session(); // static inner class

        // normal inner class
        NormalInnerClass normalInnerClass = new NormalInnerClass();
        NormalInnerClass.InnerClass innerClass = normalInnerClass.new InnerClass();
    }
}
