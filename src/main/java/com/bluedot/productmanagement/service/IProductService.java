package com.bluedot.productmanagement.service;

import com.bluedot.productmanagement.entity.Product;

import java.util.List;

public interface IProductService {

    List<Product> getAllProduct();

    Product getProductById(String id);

    Product createNewProduct(Product newProduct);

    Product updateProduct(Product product);

    String deleteProductById(String id);
}
