package day06;

import java.io.InputStream;
import java.util.Scanner;

public class Person {
    private int age;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.next());
        if (age >= 13 &&  age<= 19) {
            System.out.println("teen");
        } else if (age < 13) {
            System.out.println("kid");
        } else if (age > 19) {
            System.out.println("adult");
        }
    }
}

