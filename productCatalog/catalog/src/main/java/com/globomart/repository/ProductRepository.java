package com.globomart.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.globomart.pojo.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,String> {
	
	public List<Product> findByType(String type);
}
