package com.project.ecommerceapi.service;

import com.project.ecommerceapi.entity.ProductsEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductsService {
    List<ProductsEntity> findAllProducts();

    ProductsEntity saveProducts(ProductsEntity productsEntity);


//    Page<ProductsEntity> findProductsPageAndSort(Pageable pageable);

    Page<ProductsEntity> findProductsWithSizesPageAndSort(Pageable pageable);

    public Optional<ProductsEntity> findProductById(UUID id);


}

