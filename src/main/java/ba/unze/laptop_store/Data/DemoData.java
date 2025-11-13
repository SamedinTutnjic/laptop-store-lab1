package ba.unze.laptop_store.Data;

import ba.unze.laptop_store.Model.Accessory;
import ba.unze.laptop_store.Model.Laptop;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DemoData {

    private final List<Laptop> laptops = new ArrayList<>();
    private final List<Accessory> accessories = new ArrayList<>();

    public DemoData() {
        // ====== POČETNI ACCESSORIES ======
        accessories.add(new Accessory(1, "Logitech M185", "Mouse", 25.0, "Logitech"));
        accessories.add(new Accessory(2, "Lenovo Backpack 15.6", "Bag", 35.0, "Lenovo"));
        accessories.add(new Accessory(3, "USB-C Docking Station", "Dock", 79.9, "Baseus"));
        accessories.add(new Accessory(4, "Cooling Pad", "Cooling", 19.5, "CoolerMaster"));

        // ====== POČETNI LAPTOPI (sa stock) ======
        Laptop l1 = new Laptop(1, "Lenovo", "IdeaPad 5", 1350.0,
                "i5-1240P", "16GB", "512GB SSD", 5);
        Laptop l2 = new Laptop(2, "HP", "Victus 15", 1650.0,
                "i7-12700H", "16GB", "1TB SSD", 3);
        Laptop l3 = new Laptop(3, "Dell", "Latitude 7420", 2100.0,
                "i5-1145G7", "16GB", "512GB SSD", 2);

        // relacija 1:N
        l1.addAccessory(accessories.get(0));
        l1.addAccessory(accessories.get(1));

        laptops.add(l1);
        laptops.add(l2);
        laptops.add(l3);
    }

    // ====== GETERI ======
    public List<Laptop> getLaptops() {
        return laptops;
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }

    public Laptop getLaptopById(int id) {
        return laptops.stream()
                .filter(l -> l.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Accessory getAccessoryById(int id) {
        return accessories.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // ====== DODAVANJE ======
    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
    }

    // ====== SLIJEDEĆI ID ======
    public int getNextLaptopId() {
        return laptops.stream().mapToInt(Laptop::getId).max().orElse(0) + 1;
    }

    public int getNextAccessoryId() {
        return accessories.stream().mapToInt(Accessory::getId).max().orElse(0) + 1;
    }
}
