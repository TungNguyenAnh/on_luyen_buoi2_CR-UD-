package com.example.baitap1.model;

public class Product {
    private String name;
    private String detail;
    private double price;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                ", price=" + price +
                '}';
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, String detail, double price) {
        this.name = name;
        this.detail = detail;
        this.price = price;
    }
}
