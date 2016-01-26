package com.a2soft.domain;

import java.util.Locale.Category;

public class Product {
	private long id;
	private String name;
	private double prize;
	private String description;
	private ProductCategory productCategory;
	private Unit unit;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", prize=" + prize + ", description=" + description
				+ ", productCategory=" + productCategory + ", unit=" + unit + "]";
	}

}
