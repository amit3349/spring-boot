package com.globomart.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.globomart.pojo.Product;
import com.globomart.pricing.ConfigProperty;

@Component
public class ProductCatalogClient {

	@Autowired
	private ConfigProperty configProperty;
	
	private RestTemplate restTemplate = new RestTemplate();
    
    public Product getProductById(String id){
    	String url = "http://"+configProperty.getHost()+":"+configProperty.getPort()+"/product/list/"+id;
    	System.out.println("URL------"+url);
    	Product product = restTemplate.getForObject(url, Product.class);
    	return product;
    }
	
}
