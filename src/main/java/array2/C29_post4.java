package array2;

import java.util.Arrays;

public class C29_post4 {
    /*
    Question:

    Given a non-empty array of ints, return a new array containing the elements
    from the original array that come after the last 4 in the original array.
    The original array will contain at least one 4.
    Note that it is valid in java to create an array of length 0.

    post4([2, 4, 1, 2]) → [1, 2]
    post4([4, 1, 4, 2]) → [2]
    post4([4, 4, 1, 2, 3]) → [1, 2, 3]
    */
    public static void main(String[] args) {
       int [] arr ={4, 4, 1, 2, 3};
        System.out.println(Arrays.toString(post4(arr)));
    }
    public static int[] post4(int[] nums) {

        int index=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==4){
                index=i;
            }
        }
        int arr[]= new int[nums.length-(index+1)];
        for(int i=0;i<arr.length;i++){
            arr[i]=nums[index+1];
            index++;
        }
        return arr;
    }
}
