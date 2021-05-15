package com.capg.msc.MyShoppingCart.web;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import com.capg.msc.MyShoppingCart.bean.Product;
import com.capg.msc.MyShoppingCart.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductRestController {
	@Autowired
	private ProductService service;
		
	@GetMapping("/home")
	public String homeRequest()
	{
		return "My Shopping App " + LocalDateTime.now();
		
	}

	
	public ProductRestController() {
		System.out.println("---> Inside the ProductRestController Constructor");
		
	}
	
	@PostMapping("/product")
	public Product insertProduct(@RequestBody Product product) {
		
		service.saveProduct(product);
		return product;
		
	}
	
	@DeleteMapping("product/delete/{productId}")
	public void deleteProduct(@PathVariable("productId") int productId){
		service.delete(productId);
	}
	
	
	@GetMapping("/products")
	public List<Product> insertAllProduct(@RequestBody Product product) {
		
		
		return service.getAllProducts();
		
	}
	
	@PutMapping("/product/new")
	public Product update(@RequestBody Product product) {
		return service.saveProduct(product);
	}

}
