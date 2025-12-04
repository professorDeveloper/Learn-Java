package module3.lesson.collections.dictionary;

import java.util.Arrays;

public class SimpleDictionary<K, V> {
    private Entry<K, V>[] entries;
    private static final int DEFAULT_CAPACITY = 16;

    public SimpleDictionary() {
        this.entries = new Entry[DEFAULT_CAPACITY];
    }

    public SimpleDictionary(int capacity) {
        this.entries = new Entry[capacity];
    }

    public V put(K key, V value) {
        int hashCode = key.hashCode();
        int index = hashCode % entries.length;
        entries[index] = new Entry<>(key, value);
        return value;
    }

    @Override
    public String toString() {
        return Arrays.toString(entries);
    }

    public V get(K key) {
        if (key == null) {
            return null;
        }
        if (entries.length == 0) {
            return null;
        }

        int hashcode = key.hashCode();
        int index = hashcode % entries.length;
        var entry = entries[index];
        if (entry == null) {
            return null;
        }
        return entry.value;
    }

    public static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }
}
