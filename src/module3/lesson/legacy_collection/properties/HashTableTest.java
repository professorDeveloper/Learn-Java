package module3.lesson.legacy_collection.properties;

import java.util.Hashtable;

public class HashTableTest {
    public static void main(String[] args) {
        var ht = new Hashtable<String, Integer>();
        ht.put("one", 1);
        ht.put("two", 2);
        ht.put("three", 3);
        System.out.println(ht);

    }
}
