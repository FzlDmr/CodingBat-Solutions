package array1;

public class C12_has23 {
    /*
    Question:

    Given an int array length 2, return true if it contains a 2 or a 3.

    has23([2, 5]) → true
    has23([4, 3]) → true
    has23([4, 5]) → false
    */

    public static void main(String[] args) {
        int [] arr = {4,5};
        System.out.println(has23(arr));
    }
    public static boolean has23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return true;
            }
        }
        return false;
    }




}