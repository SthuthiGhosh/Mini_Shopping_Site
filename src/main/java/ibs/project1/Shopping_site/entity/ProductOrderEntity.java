package ibs.project1.Shopping_site.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class related with Product_order
 *
 */
@Entity
@Table(name = "PRODUCT_ORDER")
public class ProductOrderEntity {

	/**
	 * Unique productOrderId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRODUCT_ID")
	private int productOrderId;
	/**
	 * Product name ordered
	 */
	private String productOrderName;
	/**
	 * Product requirement
	 */
	private int productOrderRequirement;
	/**
	 * Product order date
	 */
	private LocalDate productOrderDate;
	/**
	 * Product fare
	 */
	private int productFare;

	/**
	 * @return the productOrderId
	 */
	public int getProductOrderId() {
		return productOrderId;
	}

	/**
	 * @param productOrderId the productOrderId to set
	 */
	public void setProductOrderId(int productOrderId) {
		this.productOrderId = productOrderId;
	}

	/**
	 * @return the productOrderName
	 */
	public String getProductOrderName() {
		return productOrderName;
	}

	/**
	 * @param productOrderName the productOrderName to set
	 */
	public void setProductOrderName(String productOrderName) {
		this.productOrderName = productOrderName;
	}

	/**
	 * @return the productOrderRequirement
	 */
	public int getProductOrderRequirement() {
		return productOrderRequirement;
	}

	/**
	 * @param productOrderRequirement the productOrderRequirement to set
	 */
	public void setProductOrderRequirement(int productOrderRequirement) {
		this.productOrderRequirement = productOrderRequirement;
	}

	/**
	 * @return the productOrderDate
	 */
	public LocalDate getProductOrderDate() {
		return productOrderDate;
	}

	/**
	 * @param productOrderDate the productOrderDate to set
	 */
	public void setProductOrderDate(LocalDate productOrderDate) {
		this.productOrderDate = productOrderDate;
	}

	/**
	 * @return the productFare
	 */
	public int getProductFare() {
		return productFare;
	}

	/**
	 * @param productFare the productFare to set
	 */
	public void setProductFare(int productFare) {
		this.productFare = productFare;
	}

}
