import java.io.*;
import java.util.*;

public class ArrMethodParams{
    public static void main(String[] args){
        int[] arr = new int[10];
        // invoking the printArray function
        ArrMethodParams obj = new ArrMethodParams();
        obj.addElements(arr);
        obj.printArray(arr);
    }

    //  Using array as an method parameters
    // adding elements to an array
    public void addElements(int[] a){
        for(int i = 0; i<a.length; ++i){
            a[i] = i;
        }
    }
    public void printArray(int[] a){
        for(int i = 0; i<a.length; ++i){
            System.out.print(a[i]+" ");
        }
    }
}