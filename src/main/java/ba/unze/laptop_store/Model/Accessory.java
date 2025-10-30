package ba.unze.laptop_store.Model;

public class Accessory {

    private int id;
    private String name;
    private String type;
    private double price;
    private String brand;

    public Accessory(int id, String name, String type, double price, String brand) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }
}
