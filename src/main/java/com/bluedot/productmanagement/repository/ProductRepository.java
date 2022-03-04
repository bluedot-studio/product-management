package com.bluedot.productmanagement.repository;

import com.bluedot.productmanagement.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {

}
