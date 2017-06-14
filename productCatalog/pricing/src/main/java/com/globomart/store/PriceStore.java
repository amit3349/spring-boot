package com.globomart.store;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.globomart.pojo.Price;

@Component
public class PriceStore {

	private List<Price> priceList = Arrays.asList(new Price(1000, "1"),new Price(2000, "2"),new Price(3000, "3"));
	
	
	public Price getPriceByProductId(String productId) {
		return priceList.stream().filter(f -> f.getProductId().equals(productId)).findFirst().get();
	}
	
	
}
