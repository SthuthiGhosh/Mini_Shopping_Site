package ibs.project1.Shopping_site;

import java.time.LocalDate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import ibs.project1.Shopping_site.entity.ProductOrderEntity;
import ibs.project1.Shopping_site.entity.UserEntity;
import ibs.project1.Shopping_site.repository.ProductOrderRepository;
import ibs.project1.Shopping_site.repository.UserRepository;

/**
 * Class for Pre-loading data into the tables "Product order" and "user"
 * @author Sthuthi
 *
 */
@Configuration
public class loadDatabase implements CommandLineRunner {

	/**
	 * Bean Injected for Product Order Repository
	 */
	@Autowired
	private ProductOrderRepository productOrderRepository;

	/**
	 * Bean Injected for User Repository
	 */
	@Autowired
	private UserRepository userRepository;

	/**
	 *Method for pre-loading database tables named "Product order" and "user"
	 */
	/**
	 *Creating objects for both the entities named "Product order" and "user"
	 */
	/**
	 *Saving datas to respective tables
	 */
	@Override
	public void run(String... args) throws Exception {
		ProductOrderEntity productOrderEntity1 = new ProductOrderEntity();
		productOrderEntity1.setProductOrderName("Lenovo Laptop");
		productOrderEntity1.setProductOrderRequirement(5);
		productOrderEntity1.setProductOrderDate(LocalDate.of(2021, 03, 21));
		productOrderEntity1.setProductFare(25000);
		productOrderRepository.save(productOrderEntity1);

		ProductOrderEntity productOrderEntity2 = new ProductOrderEntity();
		productOrderEntity2.setProductOrderName("HP Laptop");
		productOrderEntity2.setProductOrderRequirement(2);
		productOrderEntity2.setProductOrderDate(LocalDate.of(2022, 04, 29));
		productOrderEntity2.setProductFare(35000);
		productOrderRepository.save(productOrderEntity2);

		ProductOrderEntity productOrderEntity3 = new ProductOrderEntity();
		productOrderEntity3.setProductOrderName("Acer Laptop");
		productOrderEntity3.setProductOrderRequirement(4);
		productOrderEntity3.setProductOrderDate(LocalDate.of(2019, 02, 10));
		productOrderEntity3.setProductFare(30000);
		productOrderRepository.save(productOrderEntity3);
		
		ProductOrderEntity productOrderEntity4 = new ProductOrderEntity();
		productOrderEntity4.setProductOrderName("Samsung Laptop");
		productOrderEntity4.setProductOrderRequirement(1);
		productOrderEntity4.setProductOrderDate(LocalDate.of(2021, 03, 21));
		productOrderEntity4.setProductFare(55000);
		productOrderRepository.save(productOrderEntity4);
		
		UserEntity userEntity1= new UserEntity();
		userEntity1.setUserName("Sthuthi");
		userEntity1.setWalletmoney(100000);
		userRepository.save(userEntity1);
		
		UserEntity userEntity2= new UserEntity();
		userEntity2.setUserName("Ritul");
		userEntity2.setWalletmoney(200000);
		userRepository.save(userEntity2);
	}

}
