package day13;

import java.util.ArrayList;
import java.util.List;

public class RemoveLastElement {

        public static void main(String[] args) {
            List<String> stringList = new ArrayList<>();
            stringList.add("Hello");
            stringList.add("World");
            stringList.add("!");

            System.out.println("Before removal: " + stringList);

            // Removing the last object from the ArrayList
            int lastIndex = stringList.size() - 1;
            if (lastIndex >= 0) {
                stringList.remove(lastIndex);
                System.out.println("After removal: " + stringList);
            } else {
                System.out.println("The ArrayList is empty.");
            }
        }
    }

