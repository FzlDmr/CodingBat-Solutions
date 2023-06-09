package array1;

import java.util.Arrays;

public class C14_makeLast {
    /*
    Question:

    Given an int array, return a new array with double the length
    where its last element is the same as the original array, and all the other elements are 0.
    The original array will be length 1 or more. Note: by default, a new int array contains all 0's.

    makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
    makeLast([1, 2]) → [0, 0, 0, 2]
    makeLast([3]) → [0, 3]
    */

    public static void main(String[] args) {
        int[] arr = {4, 5, 6};
        System.out.println(Arrays.toString(makeLast(arr)));
    }
    public static int[] makeLast(int[] nums) {
        int [] arr = new int [2*nums.length];

        arr[2*nums.length-1]=nums[nums.length-1];

        for(int i=0; i<2*nums.length-1; i++){
            arr[i]=0;
        }

        return arr;

    }

}
