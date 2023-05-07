package array2;

import java.util.Arrays;

public class C28_pre4 {
    /*
    Question:

    Given a non-empty array of ints, return a new array containing the elements
    from the original array that come before the first 4 in the original array.
    The original array will contain at least one 4.
    Note that it is valid in java to create an array of length 0.

    pre4([1, 2, 4, 1]) → [1, 2]
    pre4([3, 1, 4]) → [3, 1]
    pre4([1, 4, 4]) → [1]
    */
    public static void main(String[] args) {
        int [] arr ={3, 1, 4};
        System.out.println(Arrays.toString(pre4(arr)));
    }
    public static int[] pre4(int[] nums) {
        int index=0;

        for (int num : nums) {
            if (num != 4) {
                index++;
            } else {
                break;
            }
        }
        int [] arr= new int[index];

        for(int i=0; i<index;i++){
            arr[i]=nums[i];
        }
        return arr;

    }

}
