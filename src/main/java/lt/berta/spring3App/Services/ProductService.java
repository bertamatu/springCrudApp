package lt.berta.spring3App.Services;

import lt.berta.spring3App.Entities.Product;
import lt.berta.spring3App.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product> listAll() {
        return repo.findAll ();
    }

    public void save(Product product) {
        repo.save ( product );
    }

    public Product get(Integer id) {
        return repo.findById ( id ).get ();
    }

    public void delete(Integer id) {
        repo.deleteById ( id );

    }
}

