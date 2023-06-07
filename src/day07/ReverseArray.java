package day07;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
         int j=arr.length-1;
         int k=0;
        for( int i =0; i<arr.length/2; i++){
            k=arr[i];
            arr[i]=arr[j];
            arr[j]=k;
            j--;
        }
       for(int i=0;i<arr.length;i++) {
           System.out.print(arr[i] + " ");
    }
    }
}
