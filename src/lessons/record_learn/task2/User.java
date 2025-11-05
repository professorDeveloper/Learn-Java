package lessons.record_learn.task2;

/*
regionName,DistrictName,homeNumber fieldlari bo'lgan Locatioin record classini yarating
Name,Phone fieldlari va Location record classi bo'lgan User classini yarating
Oldin ularga instance block orqali default qiymatlar bering Object yaratilganda qiymat berilmasa default qiymatni oladigan qiling
va qiymatni ekranga chop eting
*/

public class User {
    private String name;
    private String phone;
    private Location location;

    {
        name = "Unknown";
        phone = "Unknown";
        location = new Location();
    }

    // Constructor with parameters
    public User(String name, String phone, Location location) {
        this.name = (name != null && !name.isEmpty()) ? name : this.name;
        this.phone = (phone != null && !phone.isEmpty()) ? phone : this.phone;
        this.location = (location != null) ? location : this.location;
    }

    public User() {}


    public void showInfo() {
        System.out.println("Ism: " + name);
        System.out.println("Telefon: " + phone);
        System.out.println("Manzil: " + location.regionName() + ", " +
                location.districtName() + ", uy raqami: " + location.homeNumber());
    }
}

