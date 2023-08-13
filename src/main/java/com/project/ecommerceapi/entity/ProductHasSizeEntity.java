package com.project.ecommerceapi.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "product_has_size")
public class ProductHasSizeEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")


    @Column(name = "id", columnDefinition = "UUID")
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductsEntity product;

    @ManyToOne
    @JoinColumn(name = "size_id")
    private SizeEntity size;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ProductsEntity getProduct() {
        return product;
    }

    public void setProduct(ProductsEntity product) {
        this.product = product;
    }

    public SizeEntity getSize() {
        return size;
    }

    public void setSize(SizeEntity size) {
        this.size = size;
    }

    public ProductHasSizeEntity(UUID id, ProductsEntity product, SizeEntity size) {
        this.id = id;
        this.product = product;
        this.size = size;
    }

    public ProductHasSizeEntity(ProductsEntity product, SizeEntity size) {
        this.product = product;
        this.size = size;
    }

    @Override
    public String toString() {
        return "ProductHasSizeEntity{" +
                "id=" + id +
                ", product=" + product +
                ", size=" + size +
                '}';
    }
}
