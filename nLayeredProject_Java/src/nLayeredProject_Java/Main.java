package nLayeredProject_Java;

import nLayeredProject_Java.business.abstracts.ProductService;
import nLayeredProject_Java.business.concretes.ProductManager;
import nLayeredProject_Java.core.JLoggerManagerAdapter;
import nLayeredProject_Java.dataAccess.concretes.HibernateProductDao;
import nLayeredProject_Java.entities.concretes.Product;
public class Main {

	public static void main(String[] args) {
		
		ProductService productService = new ProductManager(new HibernateProductDao() ,new JLoggerManagerAdapter());
		
		Product product = new Product(1,2,"Erdogan",3,5);
		productService.add(product);
	}

}
