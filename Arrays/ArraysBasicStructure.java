import java.io.*;
import java.util.*;

public class ArraysBasicStructure
{
    public static void main(String[] args){
        // Declaring an array 
        int[] a;
        // Initializing an array of size 5
        a = new int[5];
        // Insert values into array
        a[0] = 1;
        a[1] = 1;
        a[2] = 1;
        a[3] = 1;
        a[4] = 1;
        // Print the array using for each loop
        for(int i:a){
            System.out.println(i+1);
        }
    }
}