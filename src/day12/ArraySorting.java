package day12;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySorting {

        public static void main(String[] args) {
            String[] strings = {"apple", "banana", "cherry", "date", "manu", "elderberry"};

            Arrays.stream(strings)
                    .sorted(Comparator.comparingInt(String::length)
                            .thenComparing(Comparator.comparingInt((String s) -> s.charAt(s.length() - 1)).reversed()))
                    .forEach(System.out::println);
        }
    }



