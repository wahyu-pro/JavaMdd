package com.challengemdd;

import java.util.*;

public class NumberEight {
    public static void main(String args[]){
        var numbers = List.of(3, 1, 7, 4, 5, 6, 8, 2);
        System.out.println(countWithoutMaxNumber(numbers));
    }

    static int countWithoutMaxNumber(List<Integer> list){
        int max = Collections.max(list);
        return list.stream().reduce(0, Integer::sum) - max;
    }
}
