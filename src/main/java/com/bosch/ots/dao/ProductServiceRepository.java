package com.bosch.ots.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bosch.ots.entity.Products;


@Repository
@Transactional
public interface ProductServiceRepository extends CrudRepository<Products, String> {

	Optional<Products> findById(@Param("id") String id);

	Products findByProductName(@Param("productName") String productName);

}
