package array1;

import java.util.Arrays;

public class C08_maxEnd3 {
    /*
    Question:

    Given an array of ints length 3, figure out which is larger,
    the first or last element in the array, and set all the other elements to be that value.
    Return the changed array.

    maxEnd3([1, 2, 3]) → [3, 3, 3]
    maxEnd3([11, 5, 9]) → [11, 11, 11]
    maxEnd3([2, 11, 3]) → [3, 3, 3]
    */
    public static void main(String[] args) {
        int[] arr ={11, 5, 9};

        System.out.println(Arrays.toString(maxEnd3(arr)));
    }
    public static int[] maxEnd3(int[] nums) {
        int [] arr = new int[3];

        int max=0;

        if(nums[0]>nums[2]){
            max=nums[0];
        }else if(nums[2]>nums[0]){
            max=nums[2];
        }else {
            max=nums[0];
        }
        arr[0]=max;
        arr[1]=max;
        arr[2]=max;

        return arr;

    }

}
