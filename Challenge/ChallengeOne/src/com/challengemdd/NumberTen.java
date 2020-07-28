package com.challengemdd;

import java.util.HashSet;
import java.util.List;

public class NumberTen {
    public static void main(String args []){
        var numbers = List.of(3, 1, 7, 4, 5, 6, 8, 2);
        var indices = List.of(8, 7, 2, 8, 2, 6);

        HashSet<Integer> set = new HashSet<>();
        set.addAll(numbers);
        set.retainAll(indices);
        System.out.println(set);
    }
}
