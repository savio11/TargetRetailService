package com.target.product.retailservice.repository;

import com.target.product.retailservice.object.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CassandraRepository<Product, Long> {

    Product findByProductId(Long id);

    @Query("update product set product_name = :productName , price = : price ,currency_code = :currency_code where product_id = : id ")
    void updateProduct(@Param("product_id") Long id,@Param("product_name") String productName,@Param("price") double price,@Param("currency_code") String currencyCode);
}
