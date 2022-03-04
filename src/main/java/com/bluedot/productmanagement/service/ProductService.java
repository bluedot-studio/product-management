package com.bluedot.productmanagement.service;

import com.bluedot.productmanagement.entity.Product;
import com.bluedot.productmanagement.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService implements IProductService{

    ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        Iterable<Product> all = productRepository.findAll();
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product getProductById(String id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product createNewProduct(Product newProduct) {
        return productRepository.save(newProduct);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public String deleteProductById(String id) {
        productRepository.deleteById(id);
        return "Success";
    }

}
