package ibs.project1.Shopping_site.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ibs.project1.Shopping_site.entity.ProductOrderEntity;

/**
 * Repository class associated with Product Order
 *
 */
@Repository
public interface ProductOrderRepository extends JpaRepository<ProductOrderEntity, Integer> {

	/**
	 * method for fetching all productOrderEntity for a particular productOrderDate
	 * 
	 * @param productOrderDate
	 * @return List&lt;ProductOrderEntity&gt; List of Product order on a particular
	 *         date
	 */
	@Query("From ProductOrderEntity where productOrderDate=:d")
	List<ProductOrderEntity> findByProductOrderDate(@Param("d") LocalDate productOrderDate);
}
