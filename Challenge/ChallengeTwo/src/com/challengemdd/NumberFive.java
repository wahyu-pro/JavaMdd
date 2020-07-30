package com.challengemdd;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberFive {
    public static void main(String[] args) {
        convertCSV();
    }

    public static void convertCSV() {
        try {
            Stream<String> stream = Files.lines(Paths.get("src/com/challengemdd/data.csv"));
            var str = stream.skip(1)
                    .map(data -> data.split(","))
                    .map(NumberFive::format).collect(Collectors.toList());

            toJson(str.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void toJson(String s) {
        try {
            FileOutputStream out = new FileOutputStream("src/com/challengemdd/data.json");
            out.write(s.getBytes());


        }catch (Exception e) {
            e.getMessage();
        }
    }

    private static Object format(String[] d) {

        return String.format("{\"name\": \"%s\",\"category\":\"%s\",\"price\":%s}", d[0], d[1], d[2]);

    }
}

