package com.project.ecommerceapi.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name = "products")
public class ProductsEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")


    @Column(name = "id", columnDefinition = "UUID")
    private UUID id;

    @Column(name = "productname")
    private String productName;

    @Column(name = "price")
    private int price;

    @Column(name = "description")
    private String description;

    @Column(name = "quantityinstock")
    private int quantityInStock;

    public ProductsEntity(UUID id, String productName, int price, String description, int quantityInStock) {

        this.id = id;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.quantityInStock = quantityInStock;
    }

    public ProductsEntity() {
        // Constructeur par défaut requis par Jackson pour la désérialisation
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    @Override
    public String toString() {
        return "ProductsEntity{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", quantityInStock=" + quantityInStock +
                '}';
    }
}
