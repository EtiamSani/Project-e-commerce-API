package com.project.ecommerceapi.service.implementation;

import com.project.ecommerceapi.entity.ProductsEntity;
import com.project.ecommerceapi.repository.ProductsRepository;
import com.project.ecommerceapi.service.ProductsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductsService {

    private final ProductsRepository productsRepository;

    public ProductServiceImpl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public List<ProductsEntity> findAllProducts() {
        return (List<ProductsEntity>) productsRepository.findAll();
    }


    public ProductsEntity saveProducts(ProductsEntity productsEntity) {
        return productsRepository.save(productsEntity);
    }


    public Page<ProductsEntity> findProductsPageAndSort(Pageable pageable) {
        return productsRepository.findAll(pageable);
    }


    public Page<ProductsEntity> findProductsWithSizesPageAndSort(Pageable pageable) {
        return productsRepository.findAll(pageable);
    }

    public Optional<ProductsEntity> findProductById(UUID id) {
        return productsRepository.findById(id);
    }

}
