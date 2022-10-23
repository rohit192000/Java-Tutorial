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
    - Size of multi dimensional array can be calculated by multiplying the size of all the dimension.
    i.e ```int [][] arr = new int[3][3];``` can store total of (3x3) i.e 9 elements. ```int[][][] arr = new int[3][4][6];``` can store total of (3x4x6) i.e 72 elemnets.

- [Two Dimensional Array](.././Arrays/Readme.md) :-
    - 
    - We have discuss 2d array in Arrays. How to declare and instantiate them. How to access the elements of 2D array.
    - e.g 
    ```java
    int[][] arr = new int[2][2];
    a[0][0] = 1;
    a[0][1] = 2;
    a[1][0] = 3;
    a[1][1] = 4;
    for(int i = 0; i<arr.length; i++){
        for(int j =0; j < arr.length; j++){
            System.out.print(a[i][j]);
        }
        System.out.println(); //next line after printing one row
    }
    ```
    Output :-
    ```
    1 2
    3 4
    ```