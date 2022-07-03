package com.company;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SquaresList implements Serializable {


    private final List<Square> squares;

    public SquaresList() {
        squares = new ArrayList<>();
    }

    public List<Square> getList() {
        return squares;
    }

    public void add(Square square) {
        squares.add(square);
    }

    public void remove(Square square) {
        squares.remove(square);
    }

    public void remove(int number) {
        if (number < squares.size())
            squares.remove(number);
    }

    public int getSize() {
        return this.squares.size();
    }

    public int countOf(String type) {

        return getListOf(type).getSize();

    }

    public SquaresList getListOf(String type) {
        SquaresList result = new SquaresList();

        for (Square item : squares) {
            if (item.getClass().getSimpleName().equalsIgnoreCase(type))
                result.add(item);
        }

        return result;
    }
    public double findAverage_Area() {
        double Average_Area = 0;
        for (int i = 0; i < squares.size(); i++) {
            Average_Area += squares.get(i).getSquare_area();
        }
        return Average_Area / (squares.size() + 1);
    }


    @Override
    public String toString() {
        return "Squares_List{" + squares + '}';
    }
}
