package com.project.ecommerceapi.service;

import com.project.ecommerceapi.entity.ProductsEntity;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductsService {
    List<ProductsEntity> findAllProducts();
    ProductsEntity saveProducts(ProductsEntity productsEntity);
    Page<ProductsEntity> findFirstThreeProducts(int pageNumber);
}

