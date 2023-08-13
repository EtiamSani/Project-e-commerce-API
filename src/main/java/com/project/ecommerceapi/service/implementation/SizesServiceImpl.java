package com.project.ecommerceapi.service.implementation;

import com.project.ecommerceapi.entity.ProductsEntity;
import com.project.ecommerceapi.entity.SizeEntity;
import com.project.ecommerceapi.repository.ProductsRepository;
import com.project.ecommerceapi.repository.SizesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizesServiceImpl {

    private final SizesRepository sizesRepository;

    public SizesServiceImpl(SizesRepository sizesRepository) {
        this.sizesRepository = sizesRepository;
    }

    List<SizeEntity> getSizes(){
        return (List<SizeEntity>) sizesRepository.findAll();
    }
}
