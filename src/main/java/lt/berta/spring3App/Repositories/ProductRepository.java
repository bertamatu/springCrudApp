package lt.berta.spring3App.Repositories;

import lt.berta.spring3App.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

