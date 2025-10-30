package ba.unze.laptop_store.Controller;

import ba.unze.laptop_store.Data.DemoData;
import ba.unze.laptop_store.Model.Accessory;
import ba.unze.laptop_store.Model.Laptop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {

    private final DemoData demoData;

    public AppController(DemoData demoData) {
        this.demoData = demoData;
    }

    // ================= LISTE =================

    @GetMapping("/laptops")
    public String showLaptops(Model model) {
        model.addAttribute("laptops", demoData.getLaptops());
        return "laptops";
    }

    @GetMapping("/accessories")
    public String showAccessories(Model model) {
        model.addAttribute("accessories", demoData.getAccessories());
        return "accessories";
    }

    // ========== DETALJ / AKCIJA ZA JEDAN LAPTOP ==========

    @GetMapping("/laptops/action/{id}")
    public String laptopAction(@PathVariable int id, Model model) {
        Laptop laptop = demoData.getLaptopById(id);
        if (laptop == null) {
            return "redirect:/laptops";
        }
        model.addAttribute("laptop", laptop);
        model.addAttribute("allAccessories", demoData.getAccessories());
        return "laptop-action";
    }

    // POST: dodaj accessory postojećem laptopu
    @PostMapping("/laptops/action/{id}/add")
    public String addAccessoryToLaptop(@PathVariable int id,
                                       @RequestParam("accessoryId") int accessoryId) {

        Laptop laptop = demoData.getLaptopById(id);
        Accessory accessory = demoData.getAccessoryById(accessoryId);

        if (laptop != null && accessory != null) {
            laptop.addAccessory(accessory);
        }

        return "redirect:/laptops/action/" + id;
    }

    // ========== NOVO: DODAJ LAPTOP ==========

    @PostMapping("/laptops/add")
    public String addLaptop(@RequestParam String brand,
                            @RequestParam String modelName,
                            @RequestParam double price,
                            @RequestParam String cpu,
                            @RequestParam String ram,
                            @RequestParam String storage,
                            @RequestParam int stock) {

        int newId = demoData.getNextLaptopId();
        Laptop laptop = new Laptop(newId, brand, modelName, price, cpu, ram, storage, stock);
        demoData.addLaptop(laptop);

        return "redirect:/laptops";
    }

    // ========== NOVO: DODAJ ACCESSORY ==========

    @PostMapping("/accessories/add")
    public String addAccessory(@RequestParam String name,
                               @RequestParam String type,
                               @RequestParam String brand,
                               @RequestParam double price) {

        int newId = demoData.getNextAccessoryId();
        Accessory accessory = new Accessory(newId, name, type, price, brand);
        demoData.addAccessory(accessory);

        return "redirect:/accessories";
    }
}
