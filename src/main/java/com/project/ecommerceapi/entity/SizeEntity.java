package com.project.ecommerceapi.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "sizes")
public class SizeEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")


    @Column(name = "id", columnDefinition = "UUID")
    private UUID id;

    @Column(name = "size")
    private String size;

    @ManyToMany(mappedBy = "sizes", fetch = FetchType.LAZY)
    private Set<ProductsEntity> products;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSizeName() {
        return size;
    }

    public void setSizeName(String sizeName) {
        this.size = size;
    }

    public SizeEntity(UUID id, String size, Set<ProductsEntity> products) {
        this.id = id;
        this.size = size;
        this.products = products;
    }

    public SizeEntity(String size, Set<ProductsEntity> products) {
        this.size = size;
        this.products = products;
    }

    public SizeEntity() {
        // Constructeur par défaut requis par Jackson pour la désérialisation
    }

    @Override
    public String toString() {
        return "SizeEntity{" +
                "id=" + id +
                ", size='" + size + '\'' +
                ", products=" + products +
                '}';
    }
}
