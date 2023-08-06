package com.project.ecommerceapi.service;

import com.project.ecommerceapi.entity.ProductsEntity;

import java.util.List;

public interface ProductsService {
    List<ProductsEntity> findAllProducts();
}
