package com.project.ecommerceapi.service;

import com.project.ecommerceapi.entity.ProductsEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductsService {
    List<ProductsEntity> findAllProducts();

    ProductsEntity saveProducts(ProductsEntity productsEntity);


    Page<ProductsEntity> findProductsPageAndSort(Pageable pageable);

}

