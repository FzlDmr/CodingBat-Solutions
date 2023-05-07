package array2;

import java.util.Arrays;

public class C26_shiftLeft {
    /*
    Question:

    Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
    You may modify and return the given array, or return a new array.

    shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
    shiftLeft([1, 2]) → [2, 1]
    shiftLeft([1]) → [1]
    */
    public static void main(String[] args) {

        int [] arr ={6, 2, 5, 3};

        System.out.println(Arrays.toString(shiftLeft(arr)));
    }
    public static int[] shiftLeft(int[] nums) {

        if(nums.length<1){
            return nums;
        }

        int[]arr=new int[nums.length];
        int a=nums[0];

        for(int i=1;i<arr.length;i++){
            arr[i-1]=nums[i];
        }
        arr[arr.length-1]=a;

        return arr;
    }

}
