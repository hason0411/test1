package com.example.android.test.entity;

import com.example.android.test.R;

/**
 * Created by Hippo on 26/03/2016.
 */
public class Cuisine {
    private float ratings;
    private String name;
    private double price;
    private String imageName;


    public String getImageName() {
        return imageName;
    }

    public void setImageName(String dishID) {
        this.imageName = dishID;
    }

    public Cuisine(float ratings, String name, double price,String imageName) {
        this.ratings = ratings;
        this.name = name;
        this.price = price;
        this.imageName = imageName;

    }

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




}
