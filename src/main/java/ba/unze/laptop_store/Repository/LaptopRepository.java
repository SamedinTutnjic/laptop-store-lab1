package ba.unze.laptop_store.Repository;

import ba.unze.laptop_store.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
}
