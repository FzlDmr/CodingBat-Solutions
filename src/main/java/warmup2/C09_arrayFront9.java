package warmup2;

public class C09_arrayFront9 {
    /*
    Question:

    Given an array of ints, return true if one of the first 4 elements in the array is a 9.
    The array length may be less than 4.

    arrayFront9([1, 2, 9, 3, 4]) → true
    arrayFront9([1, 2, 3, 4, 9]) → false
    arrayFront9([1, 2, 3, 4, 5]) → false
    */

    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 9};

        System.out.println(arrayFront9(arr));
    }

    public static boolean arrayFront9(int[] nums) {
        boolean bl=false;
        int count=0;
        int length=4;
        if(nums.length<4){
            length=nums.length;
        }
        for(int i=0 ;i<length; i++){
            if(nums[i]==9)
                count++;
        }
        if(count>0){
            bl=true;
        }else{
            bl=false;
        }return bl;
    }




}
