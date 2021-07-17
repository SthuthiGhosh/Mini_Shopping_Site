package ibs.project1.Shopping_site.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import ibs.project1.Shopping_site.entity.ProductOrderEntity;
import ibs.project1.Shopping_site.repository.ProductOrderRepository;

/**
 * Service implementation class associated with Product Order
 */
@Service
public class ProductOrderServiceImpl implements ProductOrderService {

	/**
	 * Bean created for productOrderRepository
	 */
	@Autowired
	private ProductOrderRepository productOrderRepository;

	/**
	 * Method for Add product order 
	 * Return product order productOrder
	 */
	@Override
	public ProductOrderEntity addProductOrder(ProductOrderEntity productOrder) {
		return productOrderRepository.save(productOrder);
	}

	/**
	 * method for fetch product order by descending order of ProductOrderDate
	 * @return list &lt;ProductOrderEntity &gt;List of Product order in descending order of date
	 */
	@Override
	public List<ProductOrderEntity> fetchProductOrderList() {
		return productOrderRepository.findAll(Sort.by(Direction.DESC, "productOrderDate"));
	}

	/**
	 * method for fetch product order by ProductOrderDate
	 *  @return list &lt;ProductOrderEntity &gt;List of Product order in order by date
	 */
	@Override
	public List<ProductOrderEntity> fetchProductOrderListByDate(LocalDate productOrderDate) {
		return productOrderRepository.findByProductOrderDate(productOrderDate);
	}

}
