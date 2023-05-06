package array2;

public class C09_more14 {
    /*
    Question:

    Given an array of ints, return true if the number of 1's is greater than the number of 4's

    more14([1, 4, 1]) → true
    more14([1, 4, 1, 4]) → false
    more14([1, 1]) → true
    */
    public static void main(String[] args) {
        int [] arr ={1, 4, 1, 4};
        System.out.println(more14(arr));
    }
    public static boolean more14(int[] nums) {
        int countBir=0;
        int countDort=0;

        for(int w: nums){
            if(w==1){
                countBir++;
            }
            if(w==4){
                countDort++;
            }
        }
        return countBir > countDort;
    }

}
