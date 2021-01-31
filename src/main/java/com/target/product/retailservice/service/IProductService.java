package com.target.product.retailservice.service;

import com.target.product.retailservice.object.Product;

public interface IProductService {

    String getProductInfoById(Long id);

    void updateProductInfor(Product product, Long id);
}
