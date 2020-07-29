package com.challengemdd;

import java.util.Scanner;
import java.util.stream.IntStream;

public class NumberOne {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Silahkan masukkan kalimat ! ");
        String text = input.nextLine();

        System.out.println(isPalindrome(text));

    }

    public static Boolean isPalindrome(String text) {
        String temp = text.replaceAll("[^A-Za-z]+", "").toLowerCase();
        return IntStream.range(0, text.length() / 2)
                .allMatch(i -> temp.charAt(i) == temp.charAt(temp.length() - i - 1));
    }
}
