package com.xxx.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	//define field
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="product_category")
	private String productCategory;
	
	@Column(name="product_description")
	private String productDescription;
	
	@Column(name="product_price")
	private double productPrice;
	
	@Column(name="product_condition")
	private String productCondition;
	
	@Column(name="product_status")
	private String productStatus;
	
	@Column(name="unit_nstock")
	private double unitNstock;
	
	@Column(name="product_manufacturer")
	private String productManufacturer;
	
	//define constructor
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String productName, String productCategory, String productDescription, double productPrice,
			String productCondition, String productStatus, double unitNstock, String productManufacturer) {
		super();
		this.productName = productName;
		this.productCategory = productCategory;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productCondition = productCondition;
		this.productStatus = productStatus;
		this.unitNstock = unitNstock;
		this.productManufacturer = productManufacturer;
	}

	public Product(int id, String productName, String productCategory, String productDescription, double productPrice,
			String productCondition, String productStatus, double unitNstock, String productManufacturer) {
		super();
		this.id = id;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productCondition = productCondition;
		this.productStatus = productStatus;
		this.unitNstock = unitNstock;
		this.productManufacturer = productManufacturer;
	}
	
	//define getter n setter
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCondition() {
		return productCondition;
	}

	public void setProductCondition(String productCondition) {
		this.productCondition = productCondition;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public double getUnitNstock() {
		return unitNstock;
	}

	public void setUnitNstock(double unitNstock) {
		this.unitNstock = unitNstock;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}

	//define to string
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productCategory=" + productCategory
				+ ", productDescription=" + productDescription + ", productPrice=" + productPrice
				+ ", productCondition=" + productCondition + ", productStatus=" + productStatus + ", unitNstock="
				+ unitNstock + ", productManufacturer=" + productManufacturer + "]";
	}
	

}
