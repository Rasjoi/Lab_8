package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class JsonSerialization {


        public static void saveSquares_Jackson(SquaresList squaresList) throws IOException {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File("./src/JacksonDatabase/" + LocalDate.now() + "-" + LocalDateTime.now().getHour() + "-" + LocalDateTime.now().getMinute() + "-" + LocalDateTime.now().getSecond() +"1.json"),squaresList);


        }

        public static SquaresList loadSquare_Jackson() throws IOException {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(Objects.requireNonNull(new File("./src/JacksonDatabase").listFiles())[Objects.requireNonNull(new File("./src/JacksonDatabase").listFiles()).length-1],SquaresList.class);
        }

        public static void saveCube_Jackson (CubesList cubesList) throws IOException {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File("./src/JacksonDatabase/" + LocalDate.now() + "," + LocalDateTime.now().getHour() + "," + LocalDateTime.now().getMinute() + "," + LocalDateTime.now().getSecond() +"0.json"), cubesList);

        }

        public static CubesList loadCube_Jackson() throws IOException {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(Objects.requireNonNull(new File("./src/JacksonDatabase").listFiles())[Objects.requireNonNull(new File("./src/JacksonDatabase").listFiles()).length-2],CubesList.class);
        }


    }
