package array1;

import java.util.Arrays;

public class C09_sum2 {
    /*
    Question:

    Given an array of ints, return the sum of the first 2 elements in the array.
    If the array length is less than 2, just sum up the elements that exist,
    returning 0 if the array is length 0.

    sum2([1, 2, 3]) → 3
    sum2([1, 1]) → 2
    sum2([1, 1, 1, 1]) → 2
    */
    public static void main(String[] args) {
        int[] arr ={1, 2, 3};

        System.out.println(sum2(arr));
    }
    public static int sum2(int[] nums) {
        int sum;
        if(nums.length>=2){
            return nums[0]+nums[1];
        }else if(nums.length==1){
            return nums[0];
        }return 0;
    }

}
