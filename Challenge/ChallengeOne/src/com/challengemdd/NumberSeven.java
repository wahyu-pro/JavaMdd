package com.challengemdd;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberSeven {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan tahun untuk inputan pertama = ");
        int start = input.nextInt();
        System.out.print("Masukan tahun untuk inputan kedua = ");
        int end = input.nextInt();
        System.out.println();
        System.out.println("========================================================");
        System.out.println();
        System.out.println("Daftar Tahun kabisat diantara inputan pertama dan kedua");
        System.out.println();
        get(start, end);

    }

    public static void get(int start, int end){
        List<Integer> range = IntStream.rangeClosed(start, end)
                .boxed().collect(Collectors.toList());
        range.forEach(i -> {
            if (i % 4 == 0 && i % 100 != 0) {
                if (i % 400 == 0 && i % 100 == 0) {
                    System.out.println(i + " Tahun kabisat");
                }
                System.out.println(i + " Tahun kabisat");
            }else{
                System.out.println(i + " Bukan tahun kabisat");
            }
        });
    }
}
