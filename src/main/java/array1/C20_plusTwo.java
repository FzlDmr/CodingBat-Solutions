package array1;

import java.util.Arrays;

public class C20_plusTwo {
    /*
    Question:

    Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

    plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
    plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
    plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
    */

    public static void main(String[] args) {
      int [] arr1 = {4,4};
      int [] arr2 = {2,2};

        System.out.println(Arrays.toString(plusTwo(arr1, arr2)));
    }
    public static int[] plusTwo(int[] a, int[] b) {

        int [] arr = new int[a.length+b.length];

        arr[0]=a[0];
        arr[1]=a[1];
        arr[2]=b[0];
        arr[3]=b[1];

        return arr;

    }


}
