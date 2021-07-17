package ibs.project1.Shopping_site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication make my application a spring boot Application
 * Here is from this application starts to run
 * Auto configuration is done by spring Boot
 * Embedded server tomcat starts to run when application runs as java application
 * @author Sthuthi
 *
 */
@SpringBootApplication
public class ShoppingSiteApplication {

	/**
	 * Main method where the application begins
	 * It has a method named "run" which will run the application and 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ShoppingSiteApplication.class, args);
	}
}
