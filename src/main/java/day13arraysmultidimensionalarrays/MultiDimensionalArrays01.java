package day13arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

    public static void main(String[] args) {

        //how to create multidimensional array

        int arr[][]= new int[4][2];

        System.out.println(Arrays.deepToString(arr)); //[[0, 0], [0, 0], [0, 0], [0, 0]]

        //How to add elements into a multidimensional array

        arr[0][0]=3;
        arr[0][1]=10;

        arr[1][0]=61;
        arr[1][1]=5;

        arr[2][0]= 2;
        arr[2][1]=11;

        arr[3][0]=81;
        arr[3][1]=23;
        System.out.println(Arrays.deepToString(arr)); //[[3, 10], [61, 5], [2, 11], [81, 23]]

        //how to print the element from outer array.

        System.out.println(Arrays.toString(arr[1]));//[61, 5]
        System.out.println(Arrays.toString(arr[2]));//

        //how to print the elements one by one
        System.out.println(arr[2][1]);//11












    }
}