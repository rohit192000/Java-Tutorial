# Arrays

#### In this file you can find all about arrays.

- Arrays are group of like-typed variable referred to by a common name. It means the variables in array are of same data type i.e array of integers, array of strings etc.

    - e.g
        ```java
        int[] a = {5,6,7,8};
        ```
    - Here int shows that this array contains only integers and a is common name by all the variables in the array referenced.

- Declaring an array<sup>[code](./ArrayDecInst.java)</sup>
    - 
    - data_type[] array_name; or data_type array_name[];
    - data-type can be primitive data_type like int, short, String, char or non-primitive data_type Object, Collection.
    - 
        ```java
        int[] arr;
        Object[] ao;
        Collection[] ca;
        ```
    - Here arr, ao, and ca shows that they are an array variable, but no actual array exists. They only shows that this array will hold the array of data_type given. There is no memory allocate to the array. For memory allocation we instantiate the array.

- Instantiating an Array<sup>[code](./ArrayDecInst.java)</sup> :-
    - 
    - When an array is declared, only the reference of an array is created. To create memory to the array or link an array_name(arr, ao, ca) with an actual array we are gonna allocate using ```new``` keyword and assign it to array.
    - array_name = new data_type[size]; 
     e.g. 
        ```java
        arr = new int[20];
        // default value of arr will be 0.
        ```
    - Here new keyword allocate array and memory to array_name and data_type defines the type of data being allocated and size determines the number of elements.
    - combining declaration and instantiation :- 
        ```java
        int[] arr = new int[20];
        ```
- Important points about an array in java:-
    - 
1. Arrays are dynamically allocated.
    - Creating an array is an two-way process i.e first, we declare array_variable of desired data_type and second, we allocate the memory to hold the array, using new and assign it to the array_variable(arr, ao, ca etc). Thus all the array in java are dynamically allocated. As new will allocate the memory at the runtime.

2. Array literal can be formed if size of the array and variables of an array are known.<sup>[code](./ArrayDecInst.java)</sup>
    - .
        ```java
        int[] arr = new int[]{1,35,5,4,55};
        ```
         OR 
        ```java
        int[] arr = {1,3,5,56,76};
        // The length of this array determines the length of an created array.
        ``` 

3. Since arrays are objects in java they stored in heap memory and we can find the length of an array using object property length. The size of an array must be specified by int or short not long.<sup>[code](./ArrayDecInst.java)</sup>
    - e.g.
        ```java
        int[] arr = new int[20];
        arr.length; // gives size of an array arr.
        ```
    
4. Elements of an array are stored in a contiguous memory(consecutive memory location) and have an indexes starting from 0 to n-1 where n is length of an array.<sup>[code](./ArrayDecInst.java)</sup>

    | 201 | 202 | 203 | 204 | 205 |
    | --- | --- | --- | --- | --- |
    | 2| 3 |4| 5| 6 |
    | 0 |1| 2 |3 |4 |

    - Here 201,202...205 are consecutive memory location
    - 0,1,...4 are the indexes for elements 2,3,4,5,6 respectively.

5. The direct superclass of an array is Object.

6. Every array type implements the interface Cloneable and java.io.Serializable

7. The size of an array cannot be altered once initialized. If try to altered the size of an array an ArrayIndexOutOfBoundsException will be thrown.<sup>[code](./ArrayDecInst.java)</sup>
    -e.g.
    ```java
    int[] arr = new int[4];
    int[4] = 0; //will throw error as index start from 0.
    ```

8. Elements of arrays can be accessed randomly because of its storage. Can only access from 0 to n-1 index. If try to access outside the range ArrayIndexOutOfBoundsException will be thrown.<sup>[code](./ArrayDecInst.java)</sup>
    -e.g.
    ```java
    int[] arr = {1,2,3,4};
    System.out.println(arr[0]); // 1
    System.out.println(arr[1]); // 2
    System.out.println(arr[2]); // 3
    System.out.println(arr[3]); // 4
    System.out.println(arr[4]); // will give error
    ```
    Output:-
    ```
        1
        2
        3
        4
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    ```

9. The array can also be use as a static field, a method parameters and a local variable.<sup>[code](./ArrMethodParams.java)</sup>
    -e.g
    ```java
    public void method_name(int[] a, int[] b){ // array as method parameters.
        int[] arr; // a local variable
    }
    ```

10. Arrays can be refernced to another array.<sup>[code](./ArrayDecInst.java)</sup> 
    - In this exapmle we declare and instantiate two arrays arr and arr2. Then we assign arr2 to arr. Now arr referred to the arr2. Now we can use arr to access the elements of arr2. Now arr and arr2 both referred to the same array.
    ```java
    int[] arr = {1,2,3,4,5,6};
    int[] arr2 = {10,20,30,40};
    System.out.println(arr[0]); // 1
    arr = arr2;
    System.out.println(arr[0]); // 10
    System.out.println(arr2[0]); // 10
    ```

- Accessing the array elements using for loop.<sup>[code](./ArrayLoop.java)</sup>
    - 
    - Arrays have index from 0 to n-1. We run the loop from 0 to array.length-1.
    ```java
    int[] arr = {1,2,3,4,5,6};
    for(int i = 0; i<a.length; ++i){
        System.out.println(arr[i]);
    }
    ```
    Output:-
    ```
    1
    2
    3
    4
    5
    6
    ```
- Array of Objects<sup>[code](./ArrayOfObjects.java)</sup> :-
    - 
    ```java
    class_name[] array_name = new class_name[];
    Student[] arr = new Student[7];
    ```

    - The Student array contains seven memory spaces each of size of Student class in which address of seven Student object can be stored.
    - The Student object have to instantiated by the constructor of the Student class, and their reference should be assigned to the array elements in the following way.
    - Create a constructor of class Student in Student class
    ```java
    public int a;
    public String b;
    Student(int a, String b){
        this.a = a;
        this.b = b;
    }
    ```
    - Now create and instantiate Student array in another class.
    ```java
    Student[] std = new Student[5];
    // assign objects reference to the elements of the array
    std[0] = Student(1,"Aman");
    std[1] = Student(2,"Rahul");
    std[2] = Student(3,"Naman");
    std[3] = Student(4,"Sahil");
    std[4] = Student(5,"Ross");
    ```

    ```java
    // print array using for loop
    for(int i = 0; i<std.length; i++){
        System.out.println(std[i].a+" "+std[i].b);
    }
    ```
    Output:-
    ```java
    1 Aman
    2 Rahul
    3 Naman
    4 Sahil
    5 Ross
    ```
    - Take another example, Create another Student constructor with parameter string.
    - 
    ```java
    Student(String b){
        this.b;
    }
    ```
    - Create an array of object literal in main method of another class.
    ```java
    Student[] arr = new Student[]{new Student("Dharma"),new Student("sanvi"),new Student("Rupa"),new Student("Ajay")};
    for(Student i:arr){
        System.out.println(i);
    }
    ```
    Output :-
    ```
    Student@77459877
    Student@5b2133b1
    Student@72ea2f77
    Student@33c7353a
    ``` 

    - If we write ```system.out.println(std[i])```, for it will print the address of the object as above instead of the value of a and b. As we know at ith location we have created an object using new and parameterized constructor. So it will print the reference of the object as elements of the array of object will store the reference of objects in the array.
    - To print the string we have to convert the string objects. For this we have to return value of b in Student class using function.
    ```java
    //In Student Class after constructor
    @Override
    public String toString(String b){
        return b; //Converting String Objects
    } 
    ```
    - After this Output will be
    ```
    Dharma
    sanvi
    Rupa
    Ajay
    ```

- Multi-Dimensional Array :- 
    - 
    - These arrays are the array of arrays i.e elements of these arrays are references to anothetr array.
    - Declare and Instantiate an multi-dimensonal array.
    ```java
    int[][] multiDimArray =  new int[m][n];
    ```
    - These array represent the matrices of mxn where m is no. of rows and n is the no. of columns.
    ```java
    int[][] arr = new int[2][2];
    arr[0][0] = 1; // first row first column
    arr[0][1] = 2; // first row second column
    arr[1][0] = 3; // second row second column
    arr[1][1] = 4;// second row second column
    ```
    - It shows the matrices of 2x2;
    ```
       0 1
    0| 1 2 |
    1| 3 4 |
    ```
    - To access the multi-dimensional array :- {{1,2},{3,4}}
    arr[0][1] i.e 0 shows the 0th index of array {1,2} and [1] shows the index of the array at 0th index of array i.e 2 of {1,2}.
    
    - Examples of multidimensional array :-
        - [Multi-Dimensional Array of equal no. of row and columns](./MultiDimArray.java) i.e arr[i][i]; where i ia an integer. e.g. 3x3
        ```
        1  2  3  4  5
        6  7  8  9  10
        11 12 13 14 15
        ```
        - Multi-Dimensional Array of unequal no. of rows and columns i.e arr[i][j] where i and j are integers. These arrays are also called [jagged arrays](./JaggedArray).
        ```
        1
        1 2
        1 2 3 
        1 2 3 4
        1 2 3 4 5
        ``` 

- Cloning of an array :- 
    - 
    - When we clone an array of single-dimension deep copy of array will performed at new array containing copies of the original array elements of the opposed reference i.e they are not equal as elements have different references in memory.

    - For example :-
    ```java
    int[] array = {1,2,3,4};
    int[] cloneArray = array.clone(); // it will make another memory location for cloneArray.

    // array == cloneArray => false as both array references to different memory location
    ```

    - array -> @ertd12 -> 1 2 3 4 
    - cloneArray -> @ttd566 -> 1 2 3 4
    - array and cloneArray both referenced to different memory location.
    - array != cloneArray but array[0] == cloneArray[0]; 

    - Now for the 2D array, clone method makes the shallow copy as both array and cloneArray referenced to different memory location but elements of both array referenced to same memory location where subarrays are stored.

    - ```int[][] array = {{1,2,3}, {4,5,6}};```

    - ```int[][] cloneArray = array.clone();```

    - array -> 0th , 1th with different referenced than the 
    cloneArray -> 0th , 1th. But both array and cloneArray share the subarrays i.e array->cloneArray-> {1,2,3},{4,5,6}.

    - array -> {{},{}}  
    - cloneArray -> {{},{}}
    - array == cloneArray // false
    - array[0] == cloneArray[0] // true