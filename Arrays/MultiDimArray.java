import java.io.*;
import java.util.*;

class MultiDimArray{
    public static void main(String[] args){
        int r = 5;
        //  Create and instantiate multi-dimensional array
        int[][] arr = new int[r][r];
        
        // Initialize the variables of array.
        for(int i = 0; i<arr.length; ++i){
            for(int j = 0; j<arr.length; ++j){
                arr[i][j] = i+j;
            }
        }

        // print the multi dimensional array
        for(int i = 0; i<arr.length; ++i){
            for(int j = 0; j<arr.length; ++j){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}