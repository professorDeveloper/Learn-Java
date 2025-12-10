package module3.lesson.solid.liskov_substitution;

public class PostgresSQLDatabase implements ReleationalDatabase{
    @Override
    public void createTable() {
        System.out.println("Table created");
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
