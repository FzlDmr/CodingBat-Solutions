package array2;

import java.util.Arrays;

public class C22_sameEnds {
    /*
    Question:

    Return true if the group of N numbers at the start and end of the array are the same.
    For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3.
    You may assume that n is in the range 0..nums.length inclusive.

    sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
    sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
    sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
    */
    public static void main(String[] args) {
        int [] arr ={5, 6, 45, 99, 13, 5, 6};
        System.out.println(sameEnds(arr,3));
    }
    public static boolean sameEnds(int[] nums, int len) {
        int[] arr1 = new int[len];
        int[] arr2 = new int[len];


        for(int i=0;i<len;i++){
            arr1[i]=nums[i];
            arr2[i]=nums[nums.length-len+i];
        }

        return Arrays.equals(arr1,arr2);

    }

}
