package warmup2;

public class C08_arrayCount9 {
    /*
    Question:

    Given an array of ints, return the number of 9's in the array.

    arrayCount9([1, 2, 9]) → 1
    arrayCount9([1, 9, 9]) → 2
    arrayCount9([1, 9, 9, 3, 9]) → 3
    */
    public static void main(String[] args) {

        int[] arr ={1, 9, 9, 3, 9};

        System.out.println(arrayCount9(arr));

    }
    public static int arrayCount9(int[] nums) {
        int count=0;
        for(int w : nums){
            if(w==9)
                count++;
        }return count;
    }

}
