package com.myretail.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myretail.business.ProductNameBo;
import com.myretail.domain.ProductName;
import com.myretail.model.Result;

@RestController
public class ProductController {
	
	@Autowired
	private ProductNameBo productNameBo;

	@RequestMapping(value="/productName", method=RequestMethod.POST)
	public Result saveProductName(@RequestBody ProductName productName){
		return productNameBo.saveProductName(productName);
	}
	
	@RequestMapping(value="/productName", method=RequestMethod.PUT)
	public Result updateProductName(@RequestBody ProductName productName){
		return productNameBo.updateProductName(productName);
	}
	
	@RequestMapping(value="/productName", method=RequestMethod.DELETE)
	public Result deleteProductName(@RequestBody ProductName productName){
		return productNameBo.deleteProductName(productName);
	}
	
	@RequestMapping(value="/productName/{productId}", method=RequestMethod.GET)
	public ProductName getProductName(@PathVariable String productId){
		return productNameBo.getProductName(productId);
	}
	
	@RequestMapping(value="/productName", method=RequestMethod.GET)
	public ArrayList<ProductName> getAllProductNames(){
		return productNameBo.getAllProductNames();
	}
	
}
