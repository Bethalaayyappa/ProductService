package com.bosch.ots.dto;

import java.io.Serializable;

/**
 * @author BEN6KOR
 *
 */
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String productName;
	private String onStock;
	private String category;
	private int price;

	/**
	 * @param productName
	 *            the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @param onStock
	 *            the onStock to set
	 */
	public void setOnStock(String onStock) {
		this.onStock = onStock;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @return the onStock
	 */
	public String getOnStock() {
		return onStock;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Prouduct [productName=" + productName + ", onStock=" + onStock + ", category=" + category + ", price="
				+ price + "]";
	}

}
