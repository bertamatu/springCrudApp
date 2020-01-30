package lt.berta.spring3App.Controllers;

import lt.berta.spring3App.Entities.Product;
import lt.berta.spring3App.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class EditController {

    @Autowired
    private ProductService service;

    @GetMapping("/edit")
    public String editGet(@RequestParam int id, ModelMap modelMap) {
        Product product = service.get ( id );
        modelMap.addAttribute ( "product", product );
        return "/edit";
    }

    @PostMapping(value = "/edit",
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    RedirectView editPost(Product product) {
        service.save ( product );
        return new RedirectView ( "list" );
    }
}
