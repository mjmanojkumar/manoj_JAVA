package day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


public class TransverseString {

        public static void main(String[] args) {
            List<String> stringList = new ArrayList<>();
            stringList.add("Hello");
            stringList.add("World");
            stringList.add("!");

            // Traversing using for loop
            System.out.println("Traversing using for loop:");
            for (int i = 0; i < stringList.size(); i++) {
                String element = stringList.get(i);
                System.out.println(element);
            }

            // Traversing using enhanced for loop
            System.out.println("\nTraversing using enhanced for loop:");
            for (String element : stringList) {
                System.out.println(element);
            }

            // Traversing using iterator
            System.out.println("\nTraversing using iterator:");
            Iterator<String> iterator = stringList.iterator();
            while (iterator.hasNext()) {
                String element = iterator.next();
                System.out.println(element);
            }

            // Traversing using forEach
            System.out.println("\nTraversing using forEach:");
            stringList.forEach(System.out::println);

            // Traversing using parallel Stream
            System.out.println("\nTraversing using parallel Stream:");
            Stream<String> parallelStream = stringList.parallelStream();
            parallelStream.forEach(System.out::println);
        }
    }


