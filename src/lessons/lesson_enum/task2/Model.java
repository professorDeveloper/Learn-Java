package lessons.lesson_enum.task2;

public enum Model {
    SAMSUNG(256),
    IPHONE(256),
    REDMI(128);
    private final Integer storage;

    Model(Integer storage) {
        this.storage = storage;
    }
    public Integer getStorage() {
        return storage;
    }
}
