package com.zm.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {


     static  class stu implements Comparable {
        private String name;
        private int age;
        private int high;

        public stu(String name, int age, int high) {
            this.name = name;
            this.age = age;
            this.high = high;
        }

        public stu() {
        }

        @Override
        public String toString() {
            return "stu{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", high=" + high +
                    '}';
        }

        @Override
        public int compareTo(Object o) {
            stu uu = (stu) o;
            return this.age < uu.age ? 1 : this.age == uu.age ? 0 : -1;
        }
//         @Override
//         public int compareTo1(Object o) {
//             stu uu = (stu) o;
//             return this.age < uu.age ? 1 : this.age == uu.age ? 0 : -1;
//         }
    }

    public static void main(String[] args) {
        List<stu> list = new ArrayList<>();

        list.add(new stu("Sayo", 17, 2));
        list.add(new stu("Hina", 17, 1));
        list.add(new stu("Tsugu", 16, 3));
        list.add(new stu("Dio", 100, 4));
        list.add(new stu("Naruto", 15, 7));
        list.add(new stu("Donald.Trashump", 15, 6));
        list.add(new stu("Sasuke", 15, 6));
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

