package com.globomart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globomart.client.ProductCatalogClient;
import com.globomart.pojo.Price;
import com.globomart.pojo.Product;
import com.globomart.pojo.ProductInfo;
import com.globomart.store.PriceStore;

@Service
public class PriceService {

	@Autowired
	private ProductCatalogClient client;

	@Autowired
	private PriceStore store;

	public ProductInfo getPriceByProduct(String productId) {
		Product product = client.getProductById(productId);
		Price price = store.getPriceByProductId(productId);
		return new ProductInfo(productId, product.getName(), product.getDescription(), product.getType(),
				price.getCost());
	}

}
