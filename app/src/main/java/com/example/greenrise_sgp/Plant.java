package com.example.greenrise_sgp;

import java.util.PrimitiveIterator;

public class Plant {
    private String name;
    private String about;
    private Integer price;
    private Integer quantity;
    private String image;

    public Plant(){

    }
    public Plant(String name, String about, Integer price, Integer quantity, String image) {
        this.name = name;
        this.about = about;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
