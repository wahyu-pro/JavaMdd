package com.challengemdd;

public class NumberOne {

    public static void main (String args[]){
        int x = 64, y = 2;
        penjumlahan(x, y);
        pengurangan(x, y);
        perpangkatan(x, y);
        pengakaran(x, y);
        pembagian(x, y);
        perkalian(x, y);
    }

    public static void penjumlahan(int x, int y){
        int result = x + y;
        System.out.println("Penjumlahan " + result);
    }

    public static void pengurangan(int x, int y){
        int result = x - y;
        System.out.println("pengurangan " + result);
    }

    public static void perpangkatan(int x, int y){
        double result = Math.pow(x, y) ;
        System.out.println("perpangkatan " + result);
    }

    public static void pengakaran(int x, int y){
        double bil1 = Math.sqrt(x);
        double bil2 = Math.sqrt(y);
        System.out.println("pengakaran bil 1" + bil1);
        System.out.println("pengakaran bil 2" + bil2);
    }

    public static void pembagian(int x, int y){
        int result = x / y;
        System.out.println("pembagian " + result);
    }

    public static void perkalian(int x, int y){
        int result = x * y;
        System.out.println("perkalian " + result);
    }
}
