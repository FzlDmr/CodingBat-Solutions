package array1;

import java.util.Arrays;

public class C24_frontPiece {
    /*
    Question:

    Given an int array of any length, return a new array of its first 2 elements.
    If the array is smaller than length 2, use whatever elements are present.

    frontPiece([1, 2, 3]) → [1, 2]
    frontPiece([1, 2]) → [1, 2]
    frontPiece([1]) → [1]
    */
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};

        System.out.println(Arrays.toString(frontPiece(arr)));
    }

    public static int[] frontPiece(int[] nums) {
        int [] arr = new int[2];

        if(nums.length<2){
            return nums;
        }

        arr[0]=nums[0];
        arr[1]=nums[1];

        return arr;
    }

}
