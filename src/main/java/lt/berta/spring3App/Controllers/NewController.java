package lt.berta.spring3App.Controllers;

import lt.berta.spring3App.Entities.Product;
import lt.berta.spring3App.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class NewController {

    @Autowired
    private ProductService service;

    @RequestMapping("/new")
    public String showNewProductPage(Model model) {
        Product product = new Product ();
        model.addAttribute ( "product", product );
        return "/new";
    }

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    RedirectView newPost(Product product) {
        service.save ( product );
        return new RedirectView ( "list" );
    }
}
