package ibs.project1.Shopping_site.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import ibs.project1.Shopping_site.entity.ProductOrderEntity;

/**
 * Service interface associated with Product Order
 *
 */
@Service
public interface ProductOrderService {

	/**
	 * Method for Add product order 
	 * Return product order productOrder
	 * @param productOrder
	 */
	public ProductOrderEntity addProductOrder(ProductOrderEntity productOrder);

	/**
	 * Method for fetch product orders by descending order of ProductOrderDate
	 * @return
	 */
	public List<ProductOrderEntity> fetchProductOrderList();
	/**
	 * method for fetch product orders by ProductOrderDate
	 * @param productOrderDate
	 * @return
	 */
	public List<ProductOrderEntity> fetchProductOrderListByDate(LocalDate productOrderDate);
}
