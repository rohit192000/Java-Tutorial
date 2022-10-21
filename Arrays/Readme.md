# Java-Tutorial
#### In this repository, you can found java concepts.

- Arrays are group of like-typed variable referred to by a common name. It means the variables in array are of same data type i.e array of integers, array of strings etc.

    - e.g 
        ```java
        int[] a = {5,6,7,8};
        ```
    - Here int shows that this array contains only integers and a is common name by all the variables in the array referenced.

- Declaring an array
    - data_type[] array_name; or data_type array_name[];
    - data-type can be primitive data_type like int, short, String, char or non-primitive data_type Object, Collection.
    - 
        ```java
        int[] arr;
        Object[] ao;
        Collection[] ca;
        ```
    - Here arr, ao, and ca shows that they are an array variable, but no actual array exists. They only shows that this array will hold the array of data_type given. There is no memory allocate to the array. For memory allocation we instantiate the array.

- Instantiating an Array :-
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

1. Arrays are dynamically allocated.
    - Creating an array is an two-way process i.e first, we declare array_variable of desired data_type and second, we allocate the memory to hold the array, using new and assign it to the array_variable(arr, ao, ca etc). Thus all the array in java are dynamically allocated. As new will allocate the memory at the runtime.

2. Array literal can be formed if size of the array and variables of an array are known.
    - .
        ```java
        int[] arr = new int[]{1,35,5,4,55};
        ```
         OR 
        ```java
        int[] arr = {1,3,5,56,76};
        // The length of this array determines the length of an created array.
        ``` 

3. Since arrays are objects in java they stored in heap memory and we can find the length of an array using object property length.
    - e.g.
        ```java
        int[] arr = new int[20];
        arr.length; // gives size of an array arr.
        ```
    
4. Elements of an array are stored in a contiguous memory(consecutive memory location) and have an indexes starting from 0 to n-1 where n is length of an array.

    | 201 | 202 | 203 | 204 | 205 |
    | --- | --- | --- | --- | --- |
    | 2| 3 |4| 5| 6 |
    | 0 |1| 2 |3 |4 |

    - Here 201,202...205 are consecutive memory location
    - 0,1,...4 are the indexes for elements 2,3,4,5,6 respectively.
