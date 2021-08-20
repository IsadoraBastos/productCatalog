package one.digitalinnovation.productCatalog.repository;

import one.digitalinnovation.productCatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
