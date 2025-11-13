package ba.unze.laptop_store.Model;

<<<<<<< HEAD
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Laptop {

    @Id
    private int id; // ostavljamo ručno dodjeljivanje ID-a

=======
import java.util.ArrayList;
import java.util.List;

public class Laptop {

    private int id;
>>>>>>> deb53d6bd067226775d752d00492276e94dcb9d4
    private String brand;
    private String model;
    private double price;
    private String cpu;
    private String ram;
    private String storage;
<<<<<<< HEAD
    private int stock;

    // ✅ Veza: više laptopa može pripadati jednom customeru
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    // Accessory lista i dalje ostaje samo u memoriji (nije entitet)
    @Transient
    private List<Accessory> accessories = new ArrayList<>();

    public Laptop() { }

=======
    private int stock; // broj komada na stanju

    private List<Accessory> accessories = new ArrayList<>();

>>>>>>> deb53d6bd067226775d752d00492276e94dcb9d4
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

<<<<<<< HEAD
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getCpu() { return cpu; }
    public void setCpu(String cpu) { this.cpu = cpu; }

    public String getRam() { return ram; }
    public void setRam(String ram) { this.ram = ram; }

    public String getStorage() { return storage; }
    public void setStorage(String storage) { this.storage = storage; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    // ✅ Getter i setter za Customer – OVO JE BITNO
    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public List<Accessory> getAccessories() { return accessories; }
    public void addAccessory(Accessory accessory) {
        if (accessory != null) accessories.add(accessory);
=======
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
>>>>>>> deb53d6bd067226775d752d00492276e94dcb9d4
    }
}
