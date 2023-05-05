package array2;

public class C01_countEvens {
    /*
    Question:

    Return the number of even ints in the given array.
    Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

    countEvens([2, 1, 2, 3, 4]) → 3
    countEvens([2, 2, 0]) → 3
    countEvens([1, 3, 5]) → 0
    */
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 3, 4};
        System.out.println(countEvens(arr));
    }
    public static int countEvens(int[] nums) {
        int count=0;
        for(int w: nums){
            if(w%2==0){
                count++;
            }
        }return count;
    }

}
