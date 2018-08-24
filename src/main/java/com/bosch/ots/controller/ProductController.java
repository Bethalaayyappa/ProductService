/**
 * 
 */
package com.bosch.ots.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.ots.dto.Product;
import com.bosch.ots.entity.Products;
import com.bosch.ots.service.ProductService;

/**
 * @author BEN6KOR
 *
 */
@RestController
@RequestMapping("/products")
public class ProductController {

	private static final Logger LOG = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private ProductService productService;

	/**
	 * @param productId
	 * @return
	 */
	@GetMapping(value = "/getProduct/{productId}")
	public Optional<Products> getProduct(@PathVariable String productId) {
		LOG.info("Get Product details : {}", productId);
		return productService.getProdcuts(productId);
	}

	/**
	 * @param productId
	 * @return
	 */
	@GetMapping(value = "/getAllProducts")
	public Iterable<Products> getAllProducts() {
		LOG.info("Get All Product details : {}");
		return productService.getAllProducts();
	}

	/**
	 * @param productName
	 * @return
	 */
	@GetMapping(value = "/getProductSearch/{productName}")
	public Products getProductSearch(@PathVariable String productName) {
		LOG.info("Get Product details : {}", productName);
		return productService.getProdcutInfo(productName);
	}

	/**
	 * @param productId
	 * @return
	 */
	@GetMapping(value = "/delete/{productId}")
	public String deleteProduct(@PathVariable String productId) {
		LOG.info("Delete Product  : {}", productId);
		return productService.deleteProduct(productId);
	}

	/**
	 * @param product
	 * @return
	 */
	@PostMapping(value = "/post", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String postProducts(@RequestBody Product product) {
		LOG.info("Post Prouducts : {}", product.getProductName());
		return productService.postProducts(product);
	}

	/**
	 * @param product
	 * @return
	 */
	@PostMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateProduct(@RequestBody Product product) {
		LOG.info("Update Prouduct details : {}", product.getProductName());
		return productService.updateProduct(product);
	}

}