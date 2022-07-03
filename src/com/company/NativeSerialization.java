package com.company;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;


public class NativeSerialization {
    public static void saveSquares(SquaresList squaresList) {
        try {

            FileOutputStream fileOut = new FileOutputStream("./src/NativeDatabase/" + LocalDate.now() + "-" + LocalDateTime.now().getHour() + "-" + LocalDateTime.now().getMinute() + "-" + LocalDateTime.now().getSecond() + ".txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(squaresList);
            out.close();
            fileOut.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static SquaresList loadSquares() throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(Objects.requireNonNull(new File("./src/NativeDatabase").listFiles())[Objects.requireNonNull(new File("./src/NativeDatabase").listFiles()).length-1]);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        SquaresList squaresList = (SquaresList) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return squaresList;
    }


    public static void saveCubes(CubesList cubesList) {
        try {

            FileOutputStream fileOut = new FileOutputStream("./src/NativeDatabase/" + LocalDate.now() + "-" + LocalDateTime.now().getHour() + "-" + LocalDateTime.now().getMinute() + "-" + LocalDateTime.now().getSecond() + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(cubesList);
            out.close();
            fileOut.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static CubesList loadCubes() throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(Objects.requireNonNull(new File("./src/NativeDatabase").listFiles())[Objects.requireNonNull(new File("./src/NativeDatabase").listFiles()).length-2]);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        CubesList cubesList = (CubesList) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return cubesList;
    }

}
