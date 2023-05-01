package array1;

import java.util.Arrays;

public class C03_makePi {
    /*
    Question:

    Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

    makePi() → [3, 1, 4]
    */

    public static void main(String[] args) {

        System.out.println(Arrays.toString(makePi()));
    }
    public static int[] makePi() {
        int []arr= new int[3];
        arr[0]=3;
        arr[1]=1;
        arr[2]=4;

        return arr;
    }
}
