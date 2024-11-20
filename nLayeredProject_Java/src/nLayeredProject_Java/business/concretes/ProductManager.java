package nLayeredProject_Java.business.concretes;

import java.util.List;

import nLayeredProject_Java.business.abstracts.ProductService;
import nLayeredProject_Java.core.LoggerService;
import nLayeredProject_Java.dataAccess.abstracts.ProductDao;
import nLayeredProject_Java.entities.concretes.Product;

public class ProductManager implements ProductService{
	
	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return ;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün Eklendi" + product.getName());
	}

	@Override
	public List<Product> getAll() {
		
		return null;
	}
	
}
