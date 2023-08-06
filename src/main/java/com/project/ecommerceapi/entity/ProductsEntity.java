package com.project.ecommerceapi.entity;

import javax.persistence.*;


@Entity
@Table
public class ProductsEntity {
    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )

    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String productName;

    @Column(name = "price")
    private int price;

    @Column(name = "description")
    private String description;

    @Column(name = "qte")
    private int quantityInStock;

    public ProductsEntity(long id, String productName, int price, String description, int quantityInStock) {

        this.id = id;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.quantityInStock = quantityInStock;
    }

    public ProductsEntity(String productName, int price, String description, int quantityInStock) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.quantityInStock = quantityInStock;
    }

    public ProductsEntity() {
        // Constructeur par défaut requis par Jackson pour la désérialisation
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
