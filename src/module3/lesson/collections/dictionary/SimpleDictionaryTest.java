package module3.lesson.collections.dictionary;

public class SimpleDictionaryTest {
    public static void main(String[] args) {
        var dict =new SimpleDictionary<String,String>();
        dict.put("hello","Assalamu alaykum");
        System.out.println(dict);
    }
}
