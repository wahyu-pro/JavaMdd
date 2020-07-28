package com.challengemdd;

import java.util.List;
import java.util.stream.Collectors;

public class NumberFour {
    public static void main (String args []){
        var list = List.of("Aku", "bukanlah", "Superman", "Aku", "juga", "bisa", "nangis");
        System.out.println(join(list));
    }

    static String join(List<String> list){
        var message = list.stream().distinct().collect(Collectors.joining(" "));
        return message;
    }
}
