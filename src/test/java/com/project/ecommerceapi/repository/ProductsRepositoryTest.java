package com.project.ecommerceapi.repository;

import com.project.ecommerceapi.entity.ProductsEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@DataJpaTest
class ProductsRepositoryTest {
    @Autowired
    private ProductsRepository underTest;
    @Test
    void ItShouldFindAllProductWithSizes() {

        //when
        Pageable pageable = PageRequest.of(0, 10); // Example page request
        Page<ProductsEntity> productsPage = underTest.findAllWithSizes(pageable);

        // Then
        assertThat(productsPage).isNotNull();

    }

    @Test
    void ItShouldNotFindAllProductWithSizes() {

        // Given: Prepare some test data if needed
        // ...

        // When
        Pageable pageable = PageRequest.of(0, 10); // Example page request
        Page<ProductsEntity> productsPage = underTest.findAllWithSizes(pageable);

        // Then
        assertThat(productsPage).isNotNull();
        assertThat(productsPage.getContent()).isEmpty();
    }
}