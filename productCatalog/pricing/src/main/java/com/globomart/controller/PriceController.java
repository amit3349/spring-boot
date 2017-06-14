package com.globomart.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globomart.pojo.ProductInfo;
import com.globomart.service.PriceService;

@RestController
@RequestMapping("/price")
public class PriceController {

	@Autowired
	private PriceService priceService;

	@RequestMapping("/product/id/{id}")
	public ProductInfo getPriceByProduct(@PathVariable("id") String id) {
		return priceService.getPriceByProduct(id);
	}

	@RequestMapping("/product/id/sample/{id}")
	public ProductInfo getPriceByProductSample(@PathVariable("id") String id) {
		return new ProductInfo(id, "TV", "Television", "digital", 20000);
	}

}
