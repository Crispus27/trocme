package com.crispus.trocme;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crispus.trocme.models.Product;
import com.crispus.trocme.repository.ProductRepository;

@SpringBootTest
class TrocmeApplicationTests {

	/* @Test
	void contextLoads() {
	} */


	@Autowired
	private ProductRepository productRepository;

	@Test
	 public void testCreateProduit() {
		Product prod = new Product("PC Dell3",2200.500);
		productRepository.saveAndFlush(prod);
	}
}
