package com.target.product.retailservice.controller;

import com.target.product.retailservice.object.Product;
import com.target.product.retailservice.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/products/{id}")
    public ResponseEntity<String> getProductById(@PathVariable Long id){
        String productInfo = productService.getProductInfoById(id);
        return ResponseEntity.ok().body(productInfo);
    }
    @PutMapping("/products/{id}")
    public ResponseEntity<String> updateProductInfo(@RequestBody Product product,@PathVariable Long id){
        productService.updateProductInfor(product,id);
        return ResponseEntity.ok("Product updated");
    }
}
