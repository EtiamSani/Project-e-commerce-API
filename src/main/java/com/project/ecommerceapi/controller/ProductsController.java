package com.project.ecommerceapi.controller;

import com.project.ecommerceapi.entity.ProductsEntity;
import com.project.ecommerceapi.service.ProductsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsController {
    private final ProductsService productsService;
    private static final Logger logger = LoggerFactory.getLogger(ProductsController.class);

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }
    @GetMapping
    public List<ProductsEntity> findAllProducts(){
        logger.info("Fetching all products");
        return productsService.findAllProducts();
    }

    @PostMapping
    public ProductsEntity saveProducts(@RequestBody ProductsEntity productsEntity){
        logger.info("Saving product: {}", productsEntity);
        return productsService.saveProducts(productsEntity);
    }
}
