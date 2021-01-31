package com.target.product.retailservice.object;

import lombok.Data;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table(value = "products")
public class Product {

    @PrimaryKeyColumn(value = "product_id",ordinal = 0,type = PrimaryKeyType.PARTITIONED)
    private Long productId;

    @Column(value="product_name")
    private String productName;

    @Column(value="price")
    private double price;

    @Column(value="currency_code")
    private String currencyCode;




}
