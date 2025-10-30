package ba.unze.laptop_store.Model;

import java.util.ArrayList;
import java.util.List;

public class Laptop {

    private int id;
    private String brand;
    private String model;
    private double price;
    private String cpu;
    private String ram;
    private String storage;
    private int stock; // broj komada na stanju

    private List<Accessory> accessories = new ArrayList<>();

    public Laptop(int id, String brand, String model, double price,
                  String cpu, String ram, String storage, int stock) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }

    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
    }
}
