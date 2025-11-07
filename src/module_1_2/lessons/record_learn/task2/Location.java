package module_1_2.lessons.record_learn.task2;

public record Location(String regionName, String districtName, Integer homeNumber) {
    public Location {
        if (regionName == null || regionName.isEmpty()) regionName = "Empty City";
        if (districtName == null || districtName.isEmpty()) districtName = "No region";
        if (homeNumber <= 0) homeNumber = 10;
    }

    public Location() {
        this(null, null, 0);
    }

}