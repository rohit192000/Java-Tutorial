import java.io.*;
import java.util.*;

class CopyMethods
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6};

        // copy array using iterating over elements
        // assigning elements one at time
        int[] b = new int[arr.length];
        for(int i = 0; i<arr.length; ++i){
            b[i] = arr[i];
        }
        System.out.print("Copied Array using iteration: ");
        Print obj = new Print();
        obj.print(arr,b);

        // copy array using System.arraycopy()
        int[] c = new int[arr.length];
        System.arraycopy(arr,0,c,0,2);
        System.out.print("Copied Array using System.arraycopy(): ");
        obj.print(arr,c);

        // copy array using copyOf()
        int[] d = Arrays.copyOf(arr,2);
        System.out.print("Copied Array using Arrays.copyOf(): ");
        obj.print(arr,d);

        // copy array using copyOfRange()
        int[] e = Arrays.copyOfRange(arr,1,4);
        System.out.print("Copied Array using Arrays.copyOfRange(): ");
        obj.print(arr,e);
    }
}

class Print{
    public static void print(int[] original, int[] copy){
        for(int i = 0; i<copy.length; ++i){
            System.out.print(copy[i]+" ");
        }
        copy[0]++;
        System.out.println("\nafter incrementing copy array element");
        for(int i = 0; i<copy.length; ++i){
            System.out.print(copy[i]+" ");
        }
        System.out.println("\noriginal array doesn't change");
        for(int i = 0; i<original.length; ++i){
            System.out.print(original[i]+" ");
        }
        System.out.println();

    }
}