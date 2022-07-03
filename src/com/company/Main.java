package com.company;

import java.io.IOException;

public class Main {

    public Main() {
    }

    public static void main(String[] args) throws IOException {
        final int N1 = 8;
        final int N2 = 10;
        SquaresList squaresList = new SquaresList();
        CubesList cubesList = new CubesList();
        double side = 0;

        try {

            squaresList = NativeSerialization.loadSquares();
            cubesList = NativeSerialization.loadCubes();

            squaresList = JsonSerialization.loadSquare_Jackson();
            cubesList = JsonSerialization.loadCube_Jackson();


            System.out.println("Native Ser squares:" + squaresList);
            System.out.println("Native Ser cubes:" + cubesList);
            System.out.println("\n--------------------------------------\n");


        } catch (Exception e) {
            for (int i = 0; i < N2; i++) {
                while (!Cube.CheckCorrectSide_length(side = Math.random() * 15)) ;
                {
                    cubesList.add(new Cube(side));
                }
            }
            for (int i = 0; i < N1; i++) {
                while (!Square.CheckCorrectSide_length(side = Math.random() * 15)) ;
                {
                    squaresList.add(new Square(side));
                }
            }

            System.out.println(squaresList);
            System.out.println("average area  of squares:\t" + squaresList.findAverage_Area());
            System.out.println(cubesList);
            System.out.println("amount max area cubes:\t" + cubesList.Cube_cubesMax());
        }

        NativeSerialization.saveSquares(squaresList);
        NativeSerialization.saveCubes(cubesList);
        JsonSerialization.saveSquares_Jackson(squaresList);
        JsonSerialization.saveCube_Jackson(cubesList);



    }
}