package com.myretail.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.myretail.domain.ProductName;

@Repository
public class ProductNameDaoImpl implements ProductNameDao {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public void saveProductName(ProductName productName) {
		mongoTemplate.insert(productName);
	}

	@Override
	public void updateProductName(ProductName productName) {
		
	}

	@Override
	public void deleteProductName(ProductName productName) {
		
	}

	@Override
	public ProductName getProductName(String productId) {
		return null;
	}

	@Override
	public ArrayList<ProductName> getAllProductNames() {
		return null;
	}

}
