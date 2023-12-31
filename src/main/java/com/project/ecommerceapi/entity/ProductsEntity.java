package com.project.ecommerceapi.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;


@JsonPropertyOrder({ "id", "productName", "price", "description", "quantityInStock", "category", "brand", "color", "material", "gender", "discountPrice", "isNewArrival", "isFeatured", "isBestSeller", "tags", "images", "isAvailable", "sizes" })
@Entity
@Table(name = "products")
public class ProductsEntity {


    @JoinTable(
            name = "product_have_sizes",
            joinColumns = { @JoinColumn(name = "product_id", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "size_id",  referencedColumnName = "id") }
    )

    @ManyToMany(fetch = FetchType.LAZY,cascade = { CascadeType.ALL })
    private Set<SizeEntity> sizes;
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

    @Column(name = "category")
    private String category;
    @Column(name = "brand")
    private String brand;
    @Column(name = "color")
    private String color;
    @Column(name = "material")
    private String material;
    @Column(name = "gender")
    private String gender;
    @Column(name = "discountprice")
    private int discountPrice;
    @Column(name = "isnewarrival")
    private boolean isNewArrival ;
    @Column(name = "isfeatured")
    private boolean isFeatured ;
    @Column(name = "isbestseller")
    private boolean isBestSeller ;
    @Column(name = "tags")
    private String tags ;
    @Column(name = "images")
    private String images ;
    @Column(name = "isavailable")
    private boolean isAvailable ;






    public ProductsEntity(UUID id, String productName, int price, String description, int quantityInStock, String category, String brand, String color,  String material, String gender, int discountPrice, boolean isNewArrival, boolean isFeatured, boolean isBestSeller, String tags, String images, boolean isAvailable) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.quantityInStock = quantityInStock;
        this.category = category;
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.gender = gender;
        this.discountPrice = discountPrice;
        this.isNewArrival = isNewArrival;
        this.isFeatured = isFeatured;
        this.isBestSeller = isBestSeller;
        this.tags = tags;
        this.images = images;
        this.isAvailable = isAvailable;
    }

    public ProductsEntity(String productName, int price, String description, int quantityInStock, String category, String brand, String color, String material, String gender, int discountPrice, boolean isNewArrival, boolean isFeatured, boolean isBestSeller, String tags, String images, boolean isAvailable) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.quantityInStock = quantityInStock;
        this.category = category;
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.gender = gender;
        this.discountPrice = discountPrice;
        this.isNewArrival = isNewArrival;
        this.isFeatured = isFeatured;
        this.isBestSeller = isBestSeller;
        this.tags = tags;
        this.images = images;
        this.isAvailable = isAvailable;
    }

    public ProductsEntity() {
        // Constructeur par défaut requis par Jackson pour la désérialisation
    }

    // Permet de récupérer les tailles !
    public Set<SizeEntity> getSizes() {
        return sizes;
    }

//    public void setSizes(Set<SizeEntity> sizes) {
//        this.sizes = sizes;
//    }
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    public boolean isNewArrival() {
        return isNewArrival;
    }

    public void setNewArrival(boolean newArrival) {
        isNewArrival = newArrival;
    }

    public boolean isFeatured() {
        return isFeatured;
    }

    public void setFeatured(boolean featured) {
        isFeatured = featured;
    }

    public boolean isBestSeller() {
        return isBestSeller;
    }

    public void setBestSeller(boolean bestSeller) {
        isBestSeller = bestSeller;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "ProductsEntity{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", quantityInStock=" + quantityInStock +
                ", category='" + category + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", gender='" + gender + '\'' +
                ", discountPrice=" + discountPrice +
                ", isNewArrival=" + isNewArrival +
                ", isFeatured=" + isFeatured +
                ", isBestSeller=" + isBestSeller +
                ", tags='" + tags + '\'' +
                ", images='" + images + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

}
