package module3.lesson.solid.liskov_substitution;

public class Test {
    public static void main(String[] args) {
        call(new PostgresSQLDatabase());
        call(new MongoDatabase());
    }

    static void call(Database database) {
        database.save();
        database.delete();
    }
}
