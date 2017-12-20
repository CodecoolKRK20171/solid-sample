package com.codecool.krk.model;

public class Square extends Rectangle{

    public Square(float width) {
        super(width, width);
    }

    public void setWidth(float width){
        this.width = width;
        this.height = width;
    }

    public void setHeight(float height){
        this.setWidth(height);
    }
}
