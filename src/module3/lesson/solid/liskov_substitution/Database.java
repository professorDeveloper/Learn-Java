package module3.lesson.solid.liskov_substitution;

public interface Database {
    void save();
    void delete();
    Object get();
}
