package array2;

public class C23_tripleUp {
    /*
    Question:

    Return true if the array contains, somewhere,
    three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

    tripleUp([1, 4, 5, 6, 2]) → true
    tripleUp([1, 2, 3]) → true
    tripleUp([1, 2, 4]) → false
    */
    public static void main(String[] args) {
        int [] arr ={1, 4, 5, 6, 2};
        System.out.println( tripleUp(arr));
    }
    public static boolean tripleUp(int[] nums) {
        for(int i=0; i<nums.length-2;i++){
            if(nums[i+1]-nums[i]==1 && nums[i+2]-nums[i+1]==1 ){
                return true;
            }
        }return false;
    }

}
