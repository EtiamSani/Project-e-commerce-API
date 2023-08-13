package com.project.ecommerceapi.repository;

import com.project.ecommerceapi.entity.SizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SizesRepository extends JpaRepository<SizeEntity, UUID> {

    @Override
    public default List<SizeEntity> findAll() {
        return null;
    }
}
