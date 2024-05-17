package com.buivandong.myapplication;

public class Item {
    String name;
    String desciption;
    int image;

    public Item(String name, String desciption, int image) {
        this.name = name;
        this.desciption = desciption;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
