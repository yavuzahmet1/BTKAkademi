package kodlamaaio.northwind.business.abstracts;

import kodlamaaio.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
