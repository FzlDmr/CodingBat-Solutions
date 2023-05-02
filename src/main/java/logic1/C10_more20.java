package logic1;

public class C10_more20 {
    /*
    Question:

    Return true if the given non-negative number is 1 or 2 more than a multiple of 20.

    more20(20) → false
    more20(21) → true
    more20(22) → true
    */
    public static void main(String[] args) {
        System.out.println(more20(20));
    }
    public static boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

}
