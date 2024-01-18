package com.example.baitap1.model;

public class Product {
    private int id;
    private String name;
    private String detail;
    private double price;

    public Product(int id, String name, String detail, double price) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.price = price;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                ", price=" + price +
                '}';
    }
}
