package com.project.ecommerceapi.repository;

import com.project.ecommerceapi.entity.ProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<ProductsEntity, Long> {

}
