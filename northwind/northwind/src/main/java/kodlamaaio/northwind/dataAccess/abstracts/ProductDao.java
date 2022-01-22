package kodlamaaio.northwind.dataAccess.abstracts;

import kodlamaaio.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
