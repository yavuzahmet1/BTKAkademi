package kodlamaaio.northwind.business.concretes;

import kodlamaaio.northwind.business.abstracts.ProductService;
import kodlamaaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {
    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
