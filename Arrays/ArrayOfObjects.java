import java.io.*;
import java.util.*;

class Student{
    public int a;
    public String b;

    Student(int a, String b){
        this.a = a;
        this.b = b;
    }
}

public class ArrayOfObjects
{
    public static void main(String[] args)
    {
        Student[] std = new Student[5];

        // Initializing array elements with the reference to objects of Student Class
        std[0] = new Student(1, "Ross");
        std[1] = new Student(2, "Joey");
        std[2] = new Student(3, "Richard");
        std[3] = new Student(4, "Spencer");
        std[4] = new Student(5, "Peter");

        // print the array
        for(int i = 0; i<std.length; ++i){
            System.out.println(std[i].a+" "+std[i].b);
        }
    }
}