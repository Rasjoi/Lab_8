package com.company;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cube extends Square implements Serializable {

    public Cube() {
    }

    public Cube(double side) {
        super(side);
    }

    public double Volume() {
        double volume = (this.getSide() * 3);
        return volume;

    }

    public double get_Cube_area() {
        return 6 * (this.getSide() * this.getSide());
    }

    @Override
    public String toString() {
        return "\n" + "Cube :" + super.toString().format("%.3f", get_Cube_area()) + "  "
                + "Volume: " + super.toString().format("%.3f", Volume());
    }
}
