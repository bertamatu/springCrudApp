package lt.berta.spring3App.Controllers;

import lt.berta.spring3App.Entities.Product;
import lt.berta.spring3App.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String viewHomePage() {
        return "home";
    }

    @RequestMapping("/list")
    public String viewList(Model model) {
        List<Product> listProducts = service.listAll ();
        model.addAttribute ( "listProducts", listProducts );
        return "list";
    }

    @RequestMapping("/contacts")
    public String viewContacts() {
        return "contacts";
    }
}