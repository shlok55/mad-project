package com.example.greenrise_sgp;

import java.io.Serializable;
import java.util.Map;
import java.util.PrimitiveIterator;

public class Plant implements Serializable {
    private String name;
    private String about;
    private Integer price;
    private Integer quantity;
    private String image;
    private String key;
    public Map timestamp;

    public Plant(){

    }
//    public Plant(String name, String about, Integer price, Integer quantity, String image, String key) {
//        this.name = name;
//        this.about = about;
//        this.price = price;
//        this.quantity = quantity;
//        this.image = image;
//        this.key = key;
//
//    }


    public Plant(String name, String about, Integer price, Integer quantity, String image, String key) {
        this.name = name;
        this.about = about;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
        this.key = key;
        //this.timestamp = timestamp;
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

//    public Map getTimestamp() {
//        return timestamp;
//    }
//
//    public void setTimestamp(Map timestamp) {
//        this.timestamp = timestamp;
//    }
}