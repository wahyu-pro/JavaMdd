package com.challengemdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NumberNine {
    public static void main(String args[]){
        String text = "lari pagi";
        var list = new ArrayList(Arrays.asList(text.split("")));
        System.out.println(list.stream().count());
    }

}
