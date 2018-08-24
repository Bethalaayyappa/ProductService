package com.bosch.ots.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bosch.ots.dto.Product;
import com.bosch.ots.entity.Products;

public interface ProductService {

	String postProducts(Product product);

	Optional<Products> getProdcuts(String productId);

	String updateProduct(Product product);

	String deleteProduct(String productId);

	Products getProdcutInfo(String productName);

	Iterable<Products> getAllProducts();

}
