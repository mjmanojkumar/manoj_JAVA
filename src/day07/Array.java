package day07;

public class Array {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,456,7,8,5,43,99};

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}