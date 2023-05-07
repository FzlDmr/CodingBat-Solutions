package array2;

import java.util.Arrays;

public class C34_evenOdd {
    /*
    Question:

    Return an array that contains the exact same numbers as the given array,
    but rearranged so that all the even numbers come before all the odd numbers.
    Other than that, the numbers can be in any order.
    You may modify and return the given array, or make a new array.

    evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
    evenOdd([3, 3, 2]) → [2, 3, 3]
    evenOdd([2, 2, 2]) → [2, 2, 2]
    */
    public static void main(String[] args) {
        int [] arr ={3, 3, 2};
        System.out.println(Arrays.toString(evenOdd(arr)));
    }
    public static int[] evenOdd(int[] nums) {
        int[] arr = new int[nums.length];

        int idx = 0;
        int idx2 = nums.length - 1;

        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] % 2 == 0) {
                arr[idx] = nums[i];
                idx++;
            }
            if (nums[i] % 2 != 0) {
                arr[idx2] = nums[i];
                idx2--;
            }
        }
        return arr;
    }

}
