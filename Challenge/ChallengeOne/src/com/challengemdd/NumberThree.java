package com.challengemdd;

import java.util.Scanner;

public class NumberThree {
    public static void main (String [] args){
        //deklarasikan class scanner nya dulu
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program yang bisa mengetahui tipe angka apakah ganjil, genap, atau kombinasi dengan kelipatan");
        System.out.print("Masukan angka : ");
        int nilai = scanner.nextInt();

        if (nilai % 2 == 1 && nilai % 5 == 0) System.out.println("Imperio Aberto");
        else if (nilai % 2 == 1) System.out.println("Imperio");
        else if (nilai % 2 == 0 && nilai % 4 == 0) System.out.println("Crucio Reducto");
        else if (nilai % 2 == 0) System.out.println("Crucio");

    }
}
