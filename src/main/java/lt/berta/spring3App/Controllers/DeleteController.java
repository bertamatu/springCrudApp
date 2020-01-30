package lt.berta.spring3App.Controllers;

import lt.berta.spring3App.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class DeleteController {

    @Autowired
    private ProductService service;

    @GetMapping("/delete")
    RedirectView deleteById(
            @RequestParam Integer id,
            RedirectAttributes attributes) {
        service.delete ( id );
        return new RedirectView ( "list" );
    }
}
