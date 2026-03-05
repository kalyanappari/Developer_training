package com.capg.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	private List products = Arrays.asList(new Product(1,"Washing Machine",35000),new Product(2,"TV",18000));
	
	
	public List<Product> getProducts(){
		return products;
	}
	
}
