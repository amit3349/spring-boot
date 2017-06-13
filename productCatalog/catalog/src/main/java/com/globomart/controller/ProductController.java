package com.globomart.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.globomart.pojo.Product;
import com.globomart.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/list")
	public List<Product> getAll() {
		return productService.getAllProduct();
	}

	@RequestMapping(value = "/add", method=RequestMethod.POST)
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	@RequestMapping(value = "/list/type/{type}")
	public List<Product> getAllByType(@PathVariable(value="type") String type) {
		return productService.getAllProductByType(type);
	}
	
	@RequestMapping(value="/remove/{id}", method=RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") String id){
		productService.deleteProduct(id);
	}
	
	@RequestMapping(value = "/list/sample")
	public List<Product> getAllSample() {
		return Arrays.asList(new Product("1", "TV", "Television", "digital"));
	}

}
