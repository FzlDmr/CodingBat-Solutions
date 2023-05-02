package array1;

import java.util.Arrays;

public class C26_make2 {
    /*
    Question:

    Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
    the elements from a followed by the elements from b. The arrays may be any length, including 0,
    but there will be 2 or more elements available between the 2 arrays.

    make2([4, 5], [1, 2, 3]) → [4, 5]
    make2([4], [1, 2, 3]) → [4, 1]
    make2([], [1, 2]) → [1, 2]
    */
    public static void main(String[] args) {

        int [] arr1 ={4, 5};
        int [] arr2 = {1, 2, 3};

        System.out.println(Arrays.toString(make2(arr1, arr2)));

    }
    public static int[] make2(int[] a, int[] b) {
        int [] arr = new int[2];

        if(a.length==3){
            arr[0]=a[0];
            arr[1]=a[1];
        }

        if(a.length==2){
            return a;
        }else if(a.length==1){
            arr[0]=a[0];
            arr[1]=b[0];
        }
        if(a.length ==0 && b.length==2){
            return b;
        }
        if(a.length==2&&b.length==2){
            return a;
        }
        return arr;

    }
}
