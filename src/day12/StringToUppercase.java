package day12;
import java.util.Arrays;
import java.util.Comparator;

public class StringToUppercase {
        public static void main(String[] args) {
            String[] strings = {"manoj", "kumar", "barugu"};

            Arrays.stream(strings)
                    .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                    .sorted(Comparator.naturalOrder())
                    .forEach(System.out::println);


        }
    }


