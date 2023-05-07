package array2;

import java.util.Arrays;

public class C32_withoutTen {
    /*
    Question:

    Return a version of the given array where all the 10's have been removed.
    The remaining elements should shift left towards the start of the array as needed,
    and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}.
    You may modify and return the given array or make a new array.

    withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
    withoutTen([10, 2, 10]) → [2, 0, 0]
    withoutTen([1, 99, 10]) → [1, 99, 0]
    */
    public static void main(String[] args) {
       int [] arr = {1, 99, 10};
        System.out.println(Arrays.toString(withoutTen(arr)));
    }
    public static int[] withoutTen(int[] nums) {

        int[] arr = new int[nums.length];
        int index=0;

        for (int num : nums) {
            if (num != 10) {
                arr[index] = num;
                index++;
            }
        }
        return arr;
    }

}
