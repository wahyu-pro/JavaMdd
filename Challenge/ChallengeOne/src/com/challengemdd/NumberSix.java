package com.challengemdd;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberSix {
    public static void main(String args[]) {
        listNumber();
    }

    static void listNumber() {
        List<Integer> range = IntStream.rangeClosed(1, 100)
                .boxed().collect(Collectors.toList());
        range.forEach(num -> {
            if (num % 2 == 1 && num % 7 == 0) System.out.println(num + ". Ganjil kelipatan tujuh");
            else if (num % 2 == 0 && num % 8 == 0) System.out.println(num + ". Genap kelipatan delapan");
            else if (num % 2 == 1) System.out.println(num + ". Ganjil");
            else if (num % 100 == 0) System.out.println(num + ". Kelipatan seratus");
            else if (num % 2 == 0) System.out.println(num + ". Genap");
        });
    }
}
