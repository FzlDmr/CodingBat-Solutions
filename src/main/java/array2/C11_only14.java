package array2;

public class C11_only14 {
    /*
    Question:

    Given an array of ints, return true if every element is a 1 or a 4.

    only14([1, 4, 1, 4]) → true
    only14([1, 4, 2, 4]) → false
    only14([1, 1]) → true
    */
    public static void main(String[] args) {
        int [] arr = {1, 4, 2, 4};
        System.out.println(only14(arr));
    }
    public static boolean only14(int[] nums) {
        for(int w: nums){
            if(w!=1 && w!=4){
                return false;
            }
        }return true;
    }

}
