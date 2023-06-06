package day06;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String args[]) {
        int a;
        int b;
        int c;
        int i = 2;
        int n = 10;
        a = 0;
        b = 1;
        System.out.println("Fibonacci Series for first 10 numbers: ");
        System.out.print(a+" "+b);
        while(i<n) {
            c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;
            i++;
        }
    }
    }

