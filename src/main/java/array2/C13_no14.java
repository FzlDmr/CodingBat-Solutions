package array2;

public class C13_no14 {
    /*
    Question:

    Given an array of ints, return true if it contains no 1's or it contains no 4's.

    no14([1, 2, 3]) → true
    no14([1, 2, 3, 4]) → false
    no14([2, 3, 4]) → true
    */
    public static void main(String[] args) {
        int [] arr ={1, 2, 3, 4};
        System.out.println(no14(arr));
    }
    public static boolean no14(int[] nums) {
        String s="";
        for (int num : nums) {
            s += String.valueOf(num);
        }

        if(s.contains("1")&&s.contains("4")){
            return false;
        }else if(s.contains("1")||s.contains("4")){
            return true;
        }
        return true;
    }
}
