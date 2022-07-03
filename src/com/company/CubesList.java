package com.company;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CubesList implements Serializable {

    private final List<Cube> cubes;

    public CubesList() {
        cubes = new ArrayList<>();
    }

    public List<Cube> getList() {
        return cubes;
    }

    public void add(Cube cube) {
        cubes.add(cube);
    }

    public void remove(Cube cube) {
        cubes.remove(cube);
    }

    public void remove(int number) {
        if (number < cubes.size())
            cubes.remove(number);
    }

    public int getSize() {
        return this.cubes.size();
    }

    public int countOf(String type) {

        return getListOf(type).getSize();

    }

    public CubesList getListOf(String type) {
        CubesList result = new CubesList();

        for (Cube item : cubes) {
            if (item.getClass().getSimpleName().equalsIgnoreCase(type))
                result.add(item);
        }

        return result;
    }


    public int Cube_cubesMax() {
        Cube maxCubeArea = cubes.get(0);
        int count = 0;
        for (int i = 0; i < cubes.size(); i++) {
            if (cubes.get(i).get_Cube_area() > maxCubeArea.get_Cube_area()) {
                maxCubeArea = cubes.get(i);
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Cubes_List{" + cubes + '}';
    }
}
