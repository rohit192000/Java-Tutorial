#### Here I am gonna discuss in detail about the multi dimensional array

- Multi-Dimensional arrays are the arrays of arrays i.e elements of these arrays store the reference of another array. E.g. [[1,2,3],[3,4,5],[6,7,8]] is an array of length 3 and at 0th index there is an reference to another array [1,2,3] likewise at 1th and 2th index are reference to arrays [3,4,5] and [6,7,8] respectively.

- Declaration and instantiation of Multi-Dimensionall Array
    - 
    - Syntax:-
        - ```data_type[1st Dimension][2nd Dimension][]...[nth Dimension] array_name = new int[size 1D][size 2D]..[size nthD];```
        - data_type - Type of data to be stored i.e int,char,class etc;
        - dimension - The dimension of array i.e 1D, 2D, 3D..etc.
        - array_name - Name of the array.
        - sizes - size of the dimensions respectively. Must be int or short.

    - Examples :-
    ```java
    int[][] twoD_arr = new int[2][2]; // 2D array
    int[][] threeD-arr = new int[3][3][3]; //3D array
    ```
    
