package com.xxx.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xxx.product.entity.Product;
import com.xxx.product.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	private ProductService productService;
	
	@Autowired
	public ProductController(ProductService theProductService) {
		productService=theProductService;
	}
	@GetMapping("/home")
	public String home() {
		
		return"home";
	}
	@GetMapping("/list")
	public String lisProduct(Model theModel) {
		//get Product from database
		List<Product> theProducts=productService.findAll();
		
		//add to the spring model
		theModel.addAttribute("products", theProducts);
		return "products/list-products";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		//create model attribute to bind form data	
		Product theProduct=new Product();
		
		
		theModel.addAttribute("product", theProduct);
		return "products/product-form";
	}
	@PostMapping("/save")
	public String saveProduct(@ModelAttribute("product")Product theProduct) {
		
		//save the product
		productService.save(theProduct);
		
		//use a redirect to prevent duplicate submision
		return "redirect:/products/list";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("productId") int theId, Model theModel) {
		//get product from the service
		Product theProduct=productService.findById(theId);
		
		//set product as a model attribute to pre populate the form
		theModel.addAttribute("product",theProduct);
		
		//send to our form
		return "products/product-form";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("productId") int theId) {
		//delete the product using the id
		productService.deleteById(theId);
		
		//redirect to products/list
		return "redirect:/products/list";
	}
}
