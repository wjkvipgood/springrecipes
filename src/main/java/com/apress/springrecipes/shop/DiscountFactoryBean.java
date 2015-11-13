package com.apress.springrecipes.shop;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class DiscountFactoryBean extends AbstractFactoryBean<Product> {
	private Product product;
	private double discount;

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	protected Product createInstance() throws Exception {
		product.setPrice(product.getPrice() * (1 - discount));
		return product;
	}

	@Override
	public Class<? extends Product> getObjectType() {
		return product.getClass();
	}

}
