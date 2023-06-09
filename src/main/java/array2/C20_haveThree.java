package array2;
   /*
   Question:
   Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

   haveThree([3, 1, 3, 1, 3]) → true
   haveThree([3, 1, 3, 3]) → false
   haveThree([3, 4, 3, 3, 4]) → false
   */


public class C20_haveThree {
    public boolean haveThree(int[] nums) {
        int count = 0;
        boolean prevThree = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;

                if (prevThree) {
                    return false;
                }

                prevThree = true;
            } else {
                prevThree = false;
            }
        }

        return count == 3;

    }

}
