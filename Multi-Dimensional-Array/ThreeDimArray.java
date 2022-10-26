import java.io.*;
import java.util.*;

public class ThreeDimArray {
    public static void main(String[] args){
        int [][][] arr = {
            {
                {1,2,3},
                {4,5,6},
                {7,8,9}
            },
            {
                {10,20,30},
                {40,50,60},
                {70,80,90}
            }
        };
        int len = arr.length;
        // accessing the index of 3D array
        for(int i = 0; i<len; ++i){ 
            // accessing the index of 2D array
            // 2D arraya are at index of 3D array therefore arr[i].length
            // gives the length of 2D array
            for(int j = 0; j<arr[i].length; ++j){
                // accesing the index of array
                // arrays are at index of 2D array therefore
                // arr[j].length gives the length of array
                for(int k = 0; k<arr[i][j].length; ++k){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
