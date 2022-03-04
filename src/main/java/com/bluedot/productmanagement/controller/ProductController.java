package com.bluedot.productmanagement.controller;

import com.bluedot.productmanagement.entity.Product;
import com.bluedot.productmanagement.service.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

    IProductService iProductService;

    @GetMapping("/get/all")
    public List<Product> getAllProduct(){
        return iProductService.getAllProduct();
    }

    @GetMapping("/get/{id}")
    public Product getProductById(@PathVariable String id){
        return iProductService.getProductById(id);
    }

    @PostMapping("/create")
    public Product createNewProduct(@RequestBody Product newProduct){
        return iProductService.createNewProduct(newProduct);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return iProductService.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable String id){
        return iProductService.deleteProductById(id);
    }

}
