import java.io.*;
import java.util.*;

public class JaggedArray{
    public static void main(String[] args)
    {
        int r = 5;
        // Create and instantiate the array
        int[][] arr = new int[r][];

        // Assign arrays to the elements of the array arr
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        arr[3] = new int[4];
        arr[4] = new int[5];

        // Initialize the elements of the array arr using loop
        for(int i = 0; i<arr.length; ++i){
            // j is smaller than i+1 because for every i the length of j = i+1;
            for(int j = 0; j < i+1; ++j){
                arr[i][j] = i+j;
            }
        }

        // Print the array
        for(int i = 0; i<arr.length; ++i){
            // j is smaller than i+1 because for every i the length of j = i+1;
            for(int j = 0; j < i+1; ++j){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}