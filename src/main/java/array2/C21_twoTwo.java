package array2;

public class C21_twoTwo {
    /*
    Question:

    Given an array of ints, return true if every 2 that appears in the array is next to another 2.

    twoTwo([4, 2, 2, 3]) → true
    twoTwo([2, 2, 4]) → true
    twoTwo([2, 2, 4, 2]) → false
    */
    public static void main(String[] args) {
        int [] arr ={2, 2, 4, 2};
        System.out.println(twoTwo(arr));
    }
    public static boolean twoTwo(int[] nums) {

        for(int i=0;i<nums.length ;i++){

            if(nums[i]==2){
                if(i>0 && nums[i-1]==2){

                }else if(i<nums.length-1&&nums[i+1]==2){

                }else{
                    return false;
                }

            }
        }

        return true;
    }
}
