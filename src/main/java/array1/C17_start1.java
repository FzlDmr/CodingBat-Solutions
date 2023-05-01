package array1;

import java.util.Arrays;

public class C17_start1 {
    /*
    Question:

    Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.

    start1([1, 2, 3], [1, 3]) → 2
    start1([7, 2, 3], [1]) → 1
    start1([1, 2], []) → 1
    */
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 3};

        System.out.println(start1(arr1,arr2));
    }
    public static int start1(int[] a, int[] b) {

        int count=0;
        if(a.length<1 && b.length<1){
            return 0;
        }

        if(a.length<1){
            if(b[0]==1){
                return 1;
            }else{
                return 0;
            }
        }
        if(b.length<1){
            if(a[0]==1){
                return 1;
            }else{
                return 0;
            }
        }


        if(b[0]==1){
            count++;
        }
        if(a[0]==1){
            count++;
        }
        return count;
    }
}
