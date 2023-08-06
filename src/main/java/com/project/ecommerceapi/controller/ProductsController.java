package com.project.ecommerceapi.controller;

import com.project.ecommerceapi.entity.ProductsEntity;
import com.project.ecommerceapi.service.ProductsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsController {
    private final ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }
    @GetMapping
    public List<ProductsEntity> findAllProducts(){
        return productsService.findAllProducts();
    }
}
