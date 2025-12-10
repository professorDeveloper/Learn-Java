package module3.lesson.solid.liskov_substitution;

public class MongoDatabase implements NoSQLDatabase{
    @Override
    public void createCollection() {
        System.out.println("Collection created");
    }

    @Override
    public void save() {
        System.out.println("Saved");
    }

    @Override
    public void delete() {
        System.out.println("Deleted");
    }

    @Override
    public Object get() {
        return null;
    }
}
