package array1;

public class C23_maxTriple {
    /*
    Question:

    Given an array of ints of odd length, look at the first, last,
    and middle values in the array and return the largest. The array length will be a least 1.

    maxTriple([1, 2, 3]) → 3
    maxTriple([1, 5, 3]) → 5
    maxTriple([5, 2, 3]) → 5
    */
    public static void main(String[] args) {
        int [] arr = {1, 5, 3};
        System.out.println(maxTriple(arr));
    }

    public static int maxTriple(int[] nums) {

        if(nums.length<2){
            return nums[0];
        }

        if(nums[0]>nums[(nums.length/2)]&&nums[0]>nums[nums.length-1]){
            return nums[0];

        }else if(nums[(nums.length/2)]>nums[0] && nums[(nums.length/2)]>nums[nums.length-1]){
            return nums[(nums.length/2)];

        }else if(nums[nums.length-1]>nums[0]&&nums[nums.length-1]>nums[(nums.length/2)]){
            return nums[nums.length-1];
        }

        return nums[0];
    }

}
