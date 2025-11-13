package ba.unze.laptop_store.Controller;

import ba.unze.laptop_store.Model.Customer;
import ba.unze.laptop_store.Repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerRestController {

    private final CustomerRepository repo;

    public CustomerRestController(CustomerRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Customer> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Customer getOne(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @PostMapping
    public Customer create(@RequestBody Customer c) {
        return repo.save(c);
    }
}
