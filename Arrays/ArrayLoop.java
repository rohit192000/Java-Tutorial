import java.io.*;
import java.util.*;

class ArrayLoop{
    public static void main(String[] args){
        int[] arr = new int[10];

        // assigning values to the variables in the array.
        arr[0] = 11;
        arr[1] = 12;
        arr[2] = 13;
        arr[3] = 14;
        arr[4] = 15;
        arr[5] = 16;
        arr[6] = 17;
        arr[7] = 18;
        arr[8] = 19;
        arr[9] = 20;

        // accessing an array using for loop
        System.out.println("Elements of array using for loop");
        for(int i = 0; i<arr.length; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // accessing the array using for each loop
        System.out.println("Elements of array using for each loop");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

        // accessing the array using while loop
        System.out.println("Elements of array using while loop");
        int i = 0;
        while(i<=arr.length-1){
            System.out.print(arr[i]+" ");
            i++;
        }
    }
}