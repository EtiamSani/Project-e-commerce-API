package com.project.ecommerceapi.repository;

import com.project.ecommerceapi.entity.ProductsEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends PagingAndSortingRepository<ProductsEntity, Long> {

}


