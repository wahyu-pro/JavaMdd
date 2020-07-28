package com.challengemdd;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberTwo {
    public static void main (String[] args){
        List<Integer> range = IntStream.rangeClosed(1, 1000)
                .boxed().collect(Collectors.toList());
        range.stream().filter(s ->{
            if (s<2) return false;
            for (int i = 2; i< s; i++){
                if(s % i == 0 ) return false;
            }
            return true;
        }).forEach(s -> System.out.print(s + " "));
    }
}
