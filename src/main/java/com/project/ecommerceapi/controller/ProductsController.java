package com.project.ecommerceapi.controller;

import com.project.ecommerceapi.entity.ProductsEntity;
import com.project.ecommerceapi.service.ProductsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
    public Page<ProductsEntity> findProductsPage(@RequestParam(defaultValue = "0") int page) {
        logger.info("Fetching products, page: {}", page);
        Pageable pageable = PageRequest.of(page, 10); // Nombre d'éléments par page, ici 10
        Page<ProductsEntity> productsPage = productsService.findProductsPageAndSort(pageable);

        // Log each fetched product
        productsPage.forEach(product -> {
            logger.info("Fetched product: {}", product);
        });

        return productsPage;
    }


    @PostMapping
    public ProductsEntity saveProducts(@RequestBody ProductsEntity productsEntity){
        logger.info("Saving product: {}", productsEntity);
        return ProductsService.saveProducts(productsEntity);
    }
}
