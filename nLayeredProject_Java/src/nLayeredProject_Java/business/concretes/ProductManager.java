package nLayeredProject_Java.business.concretes;

import java.util.List;

import nLayeredProject_Java.business.abstracts.ProductService;
import nLayeredProject_Java.dataAccess.abstracts.ProductDao;
import nLayeredProject_Java.entities.concretes.Product;

public class ProductManager implements ProductService{
	
	private ProductDao productDao;
	
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {
		
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return ;
		}
		
		this.productDao.add(product);
	}

	@Override
	public List<Product> getAll() {
		
		return null;
	}
	
}
