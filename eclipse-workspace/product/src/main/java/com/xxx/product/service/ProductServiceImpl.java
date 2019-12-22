package com.xxx.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxx.product.dao.ProductRepository;
import com.xxx.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public ProductServiceImpl(ProductRepository theProductRepository) {
		productRepository=theProductRepository;
	}
	@Override
	public List<Product> findAll() {
		
		return productRepository.findAll();
	}

	@Override
	public Product findById(int theId) {
		Optional<Product> result=productRepository.findById(theId);
		
		Product theProduct=null;
		
		if(result.isPresent()) {
			theProduct=result.get();
		}
		else {
			//we didn't find the product
			throw new RuntimeException("Did not find product id - " + theId); 
		}
		return theProduct;
	}

	@Override
	public void save(Product theProduct) {
		productRepository.save(theProduct);

	}

	@Override
	public void deleteById(int theId) {
		productRepository.deleteById(theId);

	}

}
