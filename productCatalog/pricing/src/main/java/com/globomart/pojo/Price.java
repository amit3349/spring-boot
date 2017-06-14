package com.globomart.pojo;

public class Price {

	private float cost;
	private String productId;
	
	public Price() {
		super();
	}

	public Price(float cost, String productId) {
		super();
		this.cost = cost;
		this.productId = productId;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	
	
	
}
