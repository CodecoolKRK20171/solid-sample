package com.codecool.krk.model;

public class Rectangle {

    protected float width;
    protected float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getArea(){
        return this.getWidth() * this.getHeight();
    }
}
