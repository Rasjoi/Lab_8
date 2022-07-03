package com.company;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Square implements Serializable {
    protected double side;


    public Square(double side) {
        this.setSide(side);
    }

    public Square() {

    }

    public static boolean CheckCorrectSide_length(double side) {
        return side > 0;


    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getSquare_area() {
        return side * side;
    }

    public double getDiagonal() {
        return (Math.sqrt(2)) * side;
    }

    @Override
    public String toString() {
        return "Perimeter=" + String.format("%.3f", getPerimeter()) + "\t" +
                "Square_area=" + String.format("%.3f", getSquare_area()) + "\t" +
                "Diagonal=" + String.format("%.3f", getDiagonal()) + "\n";
    }


}

