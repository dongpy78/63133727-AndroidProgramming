package com.buivandong.myapplication;

public class TravelListData {
    String heading;
    String description;
    int image;
    float rating;

    public TravelListData(String heading, String description, int image, float rating) {
        this.heading = heading;
        this.description = description;
        this.image = image;
        this.rating = rating;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
