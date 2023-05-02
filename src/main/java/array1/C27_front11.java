package array1;

import java.util.Arrays;

public class C27_front11 {
    /*
    Question:

    Given 2 int arrays, a and b, of any length,
    return a new array with the first element of each array.
    If either array is length 0, ignore that array.

    front11([1, 2, 3], [7, 9, 8]) → [1, 7]
    front11([1], [2]) → [1, 2]
    front11([1, 7], []) → [1]
    */
    public static void main(String[] args) {
        int [] arr1 ={1, 2, 3};
        int [] arr2 = {7, 9, 8};

        System.out.println(Arrays.toString(front11(arr1, arr2)));

    }
    public static int[] front11(int[] a, int[] b) {
        int[] arr =new int[2];
        if(a.length<1 && b.length<1){
            arr = new int[0];
            return arr;
        }
        if(a.length<1){
            arr = new int[1];
            arr[0]=b[0];
            return arr;
        }
        if(b.length<1){
            arr = new int[1];
            arr[0]=a[0];
            return arr;
        }
        arr[0]=a[0];
        arr[1]=b[0];

        return arr;
    }

}
