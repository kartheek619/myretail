package com.myretail.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myretail.business.ProductBo;
import com.myretail.model.Product;
import com.myretail.model.Result;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductBo productBo;
	
	@RequestMapping(value="/{productId}", method=RequestMethod.GET)
	public Product getProduct(@PathVariable String productId){
		return productBo.getProduct(productId);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ArrayList<Product> getAllProducts(){
		return productBo.getAllProducts();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Result saveProduct(@RequestBody Product product){
		return productBo.saveProduct(product);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public Result updateProduct(@RequestBody Product product){
		return productBo.updateProduct(product);
	}
	
	
}
