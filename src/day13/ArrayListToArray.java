package day13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

        public static void main(String[] args) {
            List<String> stringList = new ArrayList<String>();
            stringList.add("Hello");
            stringList.add("World");
            stringList.add("!");

            // Converting ArrayList to array
            String[] stringArray = stringList.toArray(new String[0]);

            // Printing the array
            for (String str : stringArray) {
                System.out.println(str);
            }
        }
    }


