package com.challengemdd;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberNine {
    public static void main(String args[]){
        String text = "lari pagi";
        var list = new ArrayList(Arrays.asList(text.split("")));
        int count = 0;
        while (count < list.size()){
            count++;
        }
        System.out.println(count);
    }
}
