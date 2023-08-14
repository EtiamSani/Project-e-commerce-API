package com.project.ecommerceapi.service;

import com.project.ecommerceapi.entity.ProductsEntity;
import com.project.ecommerceapi.repository.ProductsRepository;
import com.project.ecommerceapi.service.implementation.ProductServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductsServiceTest {

    @Mock
    private ProductsRepository productsRepository;

    @InjectMocks
    private ProductServiceImpl underTest;

    @BeforeEach
    void setUp(){


    }



    @Test
    @Disabled
    void saveProducts() {
    }

    @Test
    void canFindAllProductsWithSizesPageAndSort() {
        //when
        Pageable pageable = PageRequest.of(0, 10); // Example page request
        Page<ProductsEntity> productsPage = underTest.findProductsWithSizesPageAndSort(pageable);
        //then
        verify(productsRepository).findAll(pageable);
    }

    @Test
    void canFindOneProductById() {
        // Create a simulated ProductsEntity with a specific ID
        UUID expectedId = UUID.randomUUID();
        ProductsEntity simulatedProduct = new ProductsEntity();
        simulatedProduct.setId(expectedId);

        // Configure the mock productsRepository to return the simulated product
        when(productsRepository.findById(expectedId)).thenReturn(Optional.of(simulatedProduct));
        //when
        Pageable pageable = PageRequest.of(0, 10); // Example page request
        underTest.findProductById(expectedId);
        //then
        verify(productsRepository).findById(expectedId);
    }
}