package module3.lesson.collections.generics;

public class RawType<E> {
    private E item;

    public void setItem(E item) {
        this.item = item;
    }

    public E getItem() {
        return item;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void main(String[] args) {
        RawType rawType = new RawType();//Raw type example
        rawType.setItem("");
        rawType.setItem(12);
        rawType.setItem(false);
        System.out.println(rawType.getItem());
    }
}
