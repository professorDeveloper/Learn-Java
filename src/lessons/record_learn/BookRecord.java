package lessons.record_learn;

public record BookRecord(String name, String author, Integer pageCount, Integer price) {
    public BookRecord {
        if (name == null) throw new IllegalArgumentException("name cannot be null");
        if (author == null) throw new IllegalArgumentException("author cannot be null");
        if (pageCount == null) throw new IllegalArgumentException("pageCount cannot be null");
        if (pageCount <= 0) throw new IllegalArgumentException("pageCount cannot be negative or zero");
    }
    public String json(){
        return "{\"name\":\"" + name + "\",\"author\":\"" + author + "\",\"pageCount\":" + pageCount + ",\"price\":" + price + "}";
    }
}
