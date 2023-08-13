package com.project.ecommerceapi.repository;

import com.project.ecommerceapi.entity.ProductsEntity;
import com.project.ecommerceapi.projection.ProductsAndSizesProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductsRepository extends PagingAndSortingRepository<ProductsEntity, UUID> {
    @Query(value = "SELECT * FROM products p JOIN product_have_sizes s ON p.id = s.product_id JOIN sizes sz ON s.size_id = sz.id WHERE p.id = product_id", nativeQuery = true)
    Page<ProductsEntity> findAllWithSizes(Pageable pageable);
}


