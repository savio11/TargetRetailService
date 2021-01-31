package com.target.product.retailservice.service.impl;

import com.target.product.retailservice.exception.ResourceNotFoundException;
import com.target.product.retailservice.object.Product;
import com.target.product.retailservice.repository.ProductRepository;
import com.target.product.retailservice.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public String getProductInfoById(Long id) throws ResourceNotFoundException {
        Product productInfo = productRepository.findByProductId(id);
        if(productInfo == null){
            throw new ResourceNotFoundException(Product.class,id);
        }
        return productInfo.toString();
    }

    @Override
    public void updateProductInfor(Product product, Long id) {
        productRepository.updateProduct(id,product.getProductName(),product.getPrice(),product.getCurrencyCode());
    }
}
