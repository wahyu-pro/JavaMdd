package com.challengemdd;

import java.util.Scanner;

public class NumberFive {
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program untuk menentukan rating suatu film, dengan ketentuan sebagai berikut : ");
        System.out.print("Masukan usia : ");
        int usia = scanner.nextInt();

        if (usia >= 21) System.out.println("DEWASA");
        else if (usia >= 13) System.out.println("REMAJA");
        else if (usia >= 9) System.out.println("BIMBINGAN ORANG TUA");
        else if (usia < 9) System.out.println("SEMUA USIA");
    }
}
