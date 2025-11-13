package ba.unze.laptop_store.Data;

import ba.unze.laptop_store.Model.Customer;
import ba.unze.laptop_store.Model.Laptop;
import ba.unze.laptop_store.Repository.CustomerRepository;
import ba.unze.laptop_store.Repository.LaptopRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbSeed {

    @Bean
    CommandLineRunner seed(CustomerRepository customers, LaptopRepository laptops) {
        return args -> {
            // da ne punimo duplo ako već ima podataka
            if (customers.count() == 0 && laptops.count() == 0) {

                Customer c1 = customers.save(
                        new Customer("Amina Avdić", "amina@example.com", "061-111-222", "Zenica"));

                Customer c2 = customers.save(
                        new Customer("Haris H.", "haris@example.com", "062-333-444", "Sarajevo"));

                laptops.save(new Laptop(1, "Lenovo", "IdeaPad 5", 1350,
                        "i5-1240P", "16GB", "512GB SSD", 5));

                laptops.save(new Laptop(2, "HP", "Victus 15", 1650,
                        "i7-12700H", "16GB", "1TB SSD", 3));

                laptops.save(new Laptop(3, "Dell", "Latitude 7420", 2100,
                        "i5-1145G7", "16GB", "512GB SSD", 2));

                // dodijeli Amini prvi laptop
                Laptop l1 = laptops.findById(1).orElseThrow();
                l1.setCustomer(c1);
                laptops.save(l1);
            }
        };
    }
}
