import java.io.*;
import java.util.*;

class CloneArray 
{
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4};
        int[] cloneArray = array.clone();

        System.out.println(array == cloneArray);
        System.out.println(array[0] == cloneArray[0]);
    }
}