/**
 * 
 */
package com.bosch.ots.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.ots.dao.ProductServiceRepository;
import com.bosch.ots.dto.Product;
import com.bosch.ots.entity.Products;
import com.bosch.ots.service.ProductService;

/**
 * @author BEN6KOR
 *
 */
@Service
public class ProductServiceImpl implements ProductService {
	private static final Logger LOG = LoggerFactory.getLogger(ProductServiceImpl.class);

	@Autowired
	ProductServiceRepository productServiceRepository;

	@Override
	public String postProducts(Product product) {

		LOG.info("postProducts() .... : {} ", product.getProductName());
		Products productTemp = setData(product);
		Products productsstored = productServiceRepository.save(productTemp);
		return productsstored != null ? "Product details Stored successfully " : "Product details not inserted";
	}

	private Products setData(Product product) {
		Products prods = new Products();
		prods.setId(UUID.randomUUID().toString());
		prods.setProductName(product.getProductName());
		prods.setCategory(product.getCategory());
		prods.setOnStock(product.getOnStock());
		prods.setPrice(product.getPrice());

		return prods;
	}

	
	@Override
	public Optional<Products> getProdcuts(String productId) {
			Optional<Products> products = productServiceRepository.findById(productId);
			if (products != null) {
				return products;
			} else {
				LOG.info("Product Id is not found");
			}
		return null;
	}

	@Override
	public Iterable<Products> getAllProducts() {
		Iterable<Products> products = productServiceRepository.findAll();
		if (products != null) {
			return products;
		} else {
			LOG.info("Product Name is not found");
		}
		return null;
	}

	@Override
	public String updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProduct(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Products getProdcutInfo(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

}
