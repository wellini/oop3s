package com.oop.lab;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setHeight(side);
    }

    public double getSide(){
        return getWidth();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + width + '\'' +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
