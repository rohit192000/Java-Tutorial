import java.io.*;
import java.util.*;

public class ArrayDecInst
{
    public static void main(String[] args){
        // Declaring an array 
        int[] arr;
        // Instantiate an array of size 5
        arr = new int[5];
        // Insert values into array
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        // Size of an array using property length
        System.out.println("Size of an array :"+arr.length);

        // Array Literals
        int[] arr1 = new int[]{1,2,3,4,5,6,7};
        int[] arr2 = {10,20,30,40,50};

        // assigning arr2 to arr1.
        arr1 = arr2;
        System.out.println(arr1[1]+" "arr2[2]); //10 30
        
        // System.out.println(arr1[7]); //will give errror
    }
}
