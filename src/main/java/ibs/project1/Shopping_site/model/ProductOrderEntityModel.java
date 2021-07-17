package ibs.project1.Shopping_site.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import ibs.project1.Shopping_site.entity.ProductOrderEntity;

/**
 * Entity model for ProductOrderEntity
 * @author 91940
 *
 */
@Component
public class ProductOrderEntityModel {

	private ProductOrderEntity productOrderEntity;
	private String productOrderName;
	private int productOrderRequirement;
	private LocalDate productOrderDate;
	private int productFare;
	/**
	 * @return the productOrderEntity
	 */
	public ProductOrderEntity getProductOrderEntity() {
		return productOrderEntity;
	}
	/**
	 * @param productOrderEntity the productOrderEntity to set
	 */
	public void setProductOrderEntity(ProductOrderEntity productOrderEntity) {
		this.productOrderEntity = productOrderEntity;
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
