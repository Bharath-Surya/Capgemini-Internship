package com.capg.msc.MyShoppingCart.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.msc.MyShoppingCart.bean.Product;


public interface ProductRepository extends JpaRepository<Product, Integer> {

	/*
	 * findAll
	 * save
	 * update
	 * read
	 * delete
	 * all added automatically
	 * */

}
