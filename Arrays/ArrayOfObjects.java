import java.io.*;
import java.util.*;

class Student{
    public int a;
    public String b;

    Student(int a, String b){
        this.a = a;
        this.b = b;
    }
    Student(String b){
        this.b = b;
    }
    @Override //Uncomment fuction to print string in 2nd loop
    public String toString(){
        return b; //Converting string objects 
    }
}

public class ArrayOfObjects
{
    public static void main(String[] args)
    {
        Student[] std = new Student[5];
        Student[] myStudents = new Student[]{new Student("Dharma"),new Student("sanvi"),new Student("Rupa"),new Student("Ajay")};
         // Array of 5 students created but No students are there in the array
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
        // It will print the address of the objects
        for(Student i:myStudents){
            System.out.println(i);
        }

    }
}