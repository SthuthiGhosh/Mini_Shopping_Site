package ibs.project1.Shopping_site.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ibs.project1.Shopping_site.entity.ProductOrderEntity;
import ibs.project1.Shopping_site.service.ProductOrderService;

/**
 * Controller class for Product-order management
 *
 */
@RestController
public class ProductOrderController {

	/**
	 * Bean Injection for productOrderService
	 */
	@Autowired
	private ProductOrderService productOrderService;

	/**
	 * End point for adding product order productOrder
	 * @param productOrder
	 */
	@PostMapping("/add")
	ProductOrderEntity addProductOrder(@RequestBody ProductOrderEntity productOrder) {
		return productOrderService.addProductOrder(productOrder);
	}

	/**
	 * End point for fetching all the ProductOrder in descending order of
	 * productOrderDate
	 * @return list &lt;ProductOrderEntity &gt;List of Product order in descending order of date
	 */
	@GetMapping("/fetch")
	List<ProductOrderEntity> productOrderEntitiesList() {

		return productOrderService.fetchProductOrderList();
	}

	/**
	 * End point for fetching ProductOrder by Date
	 * 
	 *  @return list &lt;ProductOrderEntity &gt;List of Product order in particular date
	 */
	@GetMapping("/fetch/date")
	List<ProductOrderEntity> productOrderEntitiesListByDate(
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate productOrderDate) {
		return productOrderService.fetchProductOrderListByDate(productOrderDate);
	}
}
