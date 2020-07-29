package com.challengemdd;

import java.io.FileInputStream;

public class NumberFour {
    public static void main (String args []){
        try {
            var inputStream = new FileInputStream("src/com/challengemdd/file.json");
            var json = new String(inputStream.readAllBytes());


            inputStream.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
