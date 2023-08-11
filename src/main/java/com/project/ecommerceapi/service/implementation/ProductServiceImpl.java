package com.project.ecommerceapi.service.implementation;

import com.project.ecommerceapi.entity.ProductsEntity;
import com.project.ecommerceapi.repository.ProductsRepository;
import com.project.ecommerceapi.service.ProductsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public Page<ProductsEntity> findProductsPageAndSort(Pageable pageable) {
        return productsRepository.findAll(pageable);
    }

}
