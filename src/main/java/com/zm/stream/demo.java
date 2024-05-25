package com.zm.stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {

        /**
         * 创建不可变集合
         * "张三”，"李四”，"王五”，"赵理接”
         */
        // 单列集合
        List<String> list = List.of("张三", "李四", "王五", "赵理接");

        System.out.println(list);

        List.of("张三", "李四", "王五", "赵理接").forEach(s -> System.out.println(s));

        Stream<String> stream = list.stream();
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        // 双列集合
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("aaa", 111);
        hashMap.put("bbb", 222);
        hashMap.put("ccc", 333);
        hashMap.put("ddd", 444);
        hashMap.keySet() .stream().forEach(s -> System.out.println(s));
        System.out.println("=-==============");
        hashMap.entrySet().stream().forEach(s -> System.out.println(s));

        Set<String> set = new HashSet<>();
        set.add("sd0");
        set.add("sd1");
        set.add("sd2");
        set.stream().forEach(s -> System.out.println(s));


        int arr[] = {3, 38, 5, 15, 36, 26, 27, 2, 4, 19, 44, 46, 60, 45, 87, 19};

        Arrays.asList(arr).stream().forEach(ints -> System.out.print(ints));
        System.out.println("=-==============");
        Arrays.stream(arr).forEach(s -> System.out.print(s));
        Stream.of(1, 2, 3, 4, 5).forEach(s -> System.out.println(s));



    }
}
