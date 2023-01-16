/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.practice.model;

import org.bson.Document;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public abstract class Product {

    private int id;
    private int year;
    private String brand;
    private float price;
    private int stock;

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", year=" + year + ", brand=" + brand + ", price=" + price + ", stock=" + stock + '}';
    }

    public Product(int id, int year, String brand, float price, int stock) {
        this.id = id;
        this.year = year;
        this.brand = brand;
        this.price = price;
        this.stock = stock;
    }

    public Product() {
        id = 0;
        year = 0;
        brand = "";
        price = 0;
        stock = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public abstract Document createProduct();

    public abstract int readProduct();

    public abstract Product updateProduct();

    public abstract int deleteProduct();

}
