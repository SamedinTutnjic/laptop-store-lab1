package ba.unze.laptop_store.Controller;

import ba.unze.laptop_store.Model.Customer;
import ba.unze.laptop_store.Repository.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerRepository repo;

    public CustomerController(CustomerRepository repo) {
        this.repo = repo;
    }

    // LISTA KUPACA
    @GetMapping
    public String list(Model model) {
        model.addAttribute("customers", repo.findAll());
        return "customers";
    }

    // FORMA ZA NOVOG KUPCA
    @GetMapping("/new")
    public String form(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("action", "/customers");
        model.addAttribute("title", "Novi kupac");
        model.addAttribute("submit", "Spremi");
        return "customer-form";
    }

    // SPREMANJE NOVOG KUPCA
    @PostMapping
    public String save(@ModelAttribute Customer customer) {
        repo.save(customer);
        return "redirect:/customers";
    }

    // FORMA ZA EDIT POSTOJEĆEG KUPCA
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Customer cust = repo.findById(id).orElse(new Customer());
        model.addAttribute("customer", cust);
        model.addAttribute("action", "/customers/update/" + id);
        model.addAttribute("title", "Uredi kupca");
        model.addAttribute("submit", "Sačuvaj izmjene");
        return "customer-form";
    }

    // SPREMANJE IZMJENA
    @PostMapping("/update/{id}")
    public String update(@PathVariable Long id, @ModelAttribute Customer form) {
        repo.findById(id).ifPresent(db -> {
            db.setName(form.getName());
            db.setEmail(form.getEmail());
            db.setPhone(form.getPhone());
            db.setCity(form.getCity());
            repo.save(db);
        });
        return "redirect:/customers";
    }

    // BRISANJE KUPCA
    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        repo.deleteById(id);
        return "redirect:/customers";
    }
}
