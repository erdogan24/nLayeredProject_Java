package nLayeredProject_Java.business.abstracts;

import java.util.List;

import nLayeredProject_Java.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll();
}
