package com.zm.stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "张无忌1-男-20", "张无忌2-男-21",
                "张无忌3-男-22", "张无忌4-女-23", "张无忌5-女-24", "张无忌6-男-25", "张无忌-女-26");

        list.stream().filter(s -> "男 ".equals(s.split("-")[1]));

        String str = "abd";
        
    }

}
