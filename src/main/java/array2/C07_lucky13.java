package array2;

public class C07_lucky13 {
    /*
    Question:

    Given an array of ints, return true if the array contains no 1's and no 3's.

    lucky13([0, 2, 4]) → true
    lucky13([1, 2, 3]) → false
    lucky13([1, 2, 4]) → false
    */
    public static void main(String[] args) {
        int [] arr ={1, 2, 3};
        System.out.println(lucky13(arr));
    }
    public static boolean lucky13(int[] nums) {
        for(int w: nums){
            if(w==1 || w==3){
                return false;
            }
        }return true;
    }
}
