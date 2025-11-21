package module4.lessons.threadlocal.localThreadTask;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        return this.items;
    }
}
