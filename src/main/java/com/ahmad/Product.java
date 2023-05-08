package com.ahmad;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
public class Product {

    @Id
    @SequenceGenerator(
            name = "product_id_sequence",
            sequenceName = "product_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_id_sequence"
    )
    private Integer id;
    private String name;
    private Integer size;
    private Integer quantity;
    private Float price;
    private Float weight;
    private Boolean isAvailable;
    private Date stock_in_date;
    private Date stock_out_date;

    public Product(Integer id,
                   String name,
                   Integer size,
                   Integer quantity,
                   Float price,
                   Float weight,
                   Boolean isAvailable,
                   Date stock_in_date,
                   Date stock_out_date) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
        this.weight = weight;
        this.isAvailable = isAvailable;
        this.stock_in_date = stock_in_date;
        this.stock_out_date = stock_out_date;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public Date getStock_in_date() {
        return stock_in_date;
    }

    public void setStock_in_date(Date stock_in_date) {
        this.stock_in_date = stock_in_date;
    }

    public Date getStock_out_date() {
        return stock_out_date;
    }

    public void setStock_out_date(Date stock_out_date) {
        this.stock_out_date = stock_out_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(name, product.name) && Objects.equals(size, product.size) && Objects.equals(quantity, product.quantity) && Objects.equals(price, product.price) && Objects.equals(weight, product.weight) && Objects.equals(isAvailable, product.isAvailable) && Objects.equals(stock_in_date, product.stock_in_date) && Objects.equals(stock_out_date, product.stock_out_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, size, quantity, price, weight, isAvailable, stock_in_date, stock_out_date);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", quantity=" + quantity +
                ", price=" + price +
                ", weight=" + weight +
                ", isAvailable=" + isAvailable +
                ", stock_in_date=" + stock_in_date +
                ", stock_out_date=" + stock_out_date +
                '}';
    }
}
