package com.globomart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globomart.pojo.Product;
import com.globomart.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProduct() {
		List<Product> products = new ArrayList<Product>();
		productRepository.findAll().forEach(products::add);
		return products;
	}

	public void addProduct(Product product) {
		productRepository.save(product);
	}

	public void deleteProduct(String id) {
		productRepository.delete(id);
	}

	public List<Product> getAllProductByType(String type) {
		List<Product> products = new ArrayList<Product>();
		products = productRepository.findByType(type);
		return products;
	}

	public Product getProductById(String id) {
		List<Product> products = new ArrayList<Product>();
		products = productRepository.findById(id);
		if(products.size()>0) return products.get(0);
		return null;
	}

}
