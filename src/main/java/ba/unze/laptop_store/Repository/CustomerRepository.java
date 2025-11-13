package ba.unze.laptop_store.Repository;

import ba.unze.laptop_store.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> { }
