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

- [Three Dimensional array](./ThreeDimArray.java)
    - It's an complex form of an multi-dimension array.
    - For better understanding, three dimension array are arrays of 2D arrays.
    - { Array Index[0,1,2]
    {
        row index[0,1,2]
        {
            columnindex[0,1,2]
        }
    }

    }
    - Indirect Method :-

    - Declaration and Instantiation :-
        - ```data_type[][][] array_name = new int[x][y][z];
                For example : int[][][] arr = new int[10][20][30
                ```
    
    - Initialization :- 
        - ```array_name[array_index][row_index][column-index]  = value;```
        - array_name[0][0][0] = 1;

    - Direct Method of Declaration :- 
    
    - Declaration and Instantiation :-
        ```
        data_type[][][] array_name = {
            {
                {valueA1R1C1, valueA1R1C2, valueA1R1C3,..},
                {valueA1R2C1, valueA1R2C2, valueA1R2C3,..}
            },
            {
                {valueA2R1C1, valueA2R1C2, valueA2R1C3,..}
                {valueA2R2C1, valueA2R2C2, valueA2R2C3,..}

            }
        }
        ```
    - For Example :- 
    ```
    int[][][] arr = {
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
    } //array of 2D arrays.
    ```

    - Accessing the 3D Array  :- 
        - For Example :- 
        ```java
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
                    System.out.println("arr["+i+"]["+j+"]["+k+"] is : "+arr[i][j][k] );
                }
            }
        }
        ```
        Output :-
        ```
        arr[0][0][0] is : 1
        arr[0][0][1] is : 2
        arr[0][0][2] is : 3
        arr[0][1][0] is : 4
        arr[0][1][1] is : 5
        arr[0][1][2] is : 6
        arr[0][2][0] is : 7
        arr[0][2][1] is : 8
        arr[0][2][2] is : 9
        arr[1][0][0] is : 10
        arr[1][0][1] is : 20
        arr[1][0][2] is : 30
        arr[1][1][0] is : 40
        arr[1][1][1] is : 50
        arr[1][1][2] is : 60
        arr[1][2][0] is : 70
        arr[1][2][1] is : 80
        arr[1][2][2] is : 90
        ```
        - If want to print in a tabular format just use print instead of println and in the print method write ```arr[i][j][k]+" "``` and write empty println method after 2nd and 3rd loop. See code of ThreeDimArray.java.