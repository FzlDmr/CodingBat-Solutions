package array1;

import java.util.Arrays;

public class C19_makeMiddle {
    /*
    Question:

    Given an array of ints of even length,
    return a new array length 2 containing the middle two elements from the original array.
    The original array will be length 2 or more.

    makeMiddle([1, 2, 3, 4]) → [2, 3]
    makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
    makeMiddle([1, 2]) → [1, 2]
    */
    public static void main(String[] args) {
     int [] arr = {7, 1, 2, 3, 4, 9};

        System.out.println(Arrays.toString(makeMiddle(arr)));
    }

    public static int[] makeMiddle(int[] nums) {
        int [] arr = new int[2];
        if(nums.length<3){
            return nums;
        }
        arr[0]=nums[(nums.length/2)-1];
        arr[1]=nums[nums.length/2];

        return arr;
    }




}
