package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductTable")
public class ProductTable {
	
	@Id
	private int userId;
	
	@Column
	private int productId;
	
	@Column
	private double productPrice;
	
	@Column
	private String productColour;
	
	
	@Column
	private String productDimension;
	
	@Column
	private int productQuantity;
	
	@Column
	private String productSpecification;
	
	@Column
	private int productCategory;                
	
	@Column
	private String productManufacture;
	
	@Column
	private String productName;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductColour() {
		return productColour;
	}

	public void setProductColour(String productColour) {
		this.productColour = productColour;
	}

	public String getProductDimension() {
		return productDimension;
	}

	public void setProductDimension(String productDimension) {
		this.productDimension = productDimension;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductSpecification() {
		return productSpecification;
	}

	public void setProductSpecification(String productSpecification) {
		this.productSpecification = productSpecification;
	}

	public int getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(int productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductManufacture() {
		return productManufacture;
	}

	public void setProductManufacture(String productManufacture) {
		this.productManufacture = productManufacture;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public ProductTable(int userId, int productId, double productPrice, String productColour, String productDimension,
			int productQuantity, String productSpecification, int productCategory, String productManufacture,
			String productName) {
		super();
		this.userId = userId;
		this.productId = productId;
		this.productPrice = productPrice;
		this.productColour = productColour;
		this.productDimension = productDimension;
		this.productQuantity = productQuantity;
		this.productSpecification = productSpecification;
		this.productCategory = productCategory;
		this.productManufacture = productManufacture;
		this.productName = productName;
	}

	public ProductTable() {
		super();
	}
}
