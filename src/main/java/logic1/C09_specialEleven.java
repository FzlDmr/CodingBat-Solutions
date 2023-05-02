package logic1;

public class C09_specialEleven {
    /*
    Question:

    We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
    Return true if the given non-negative number is special. Use the % "mod" operator --

    specialEleven(22) → true
    specialEleven(23) → true
    specialEleven(24) → false
    */
    public static void main(String[] args) {
        System.out.println(specialEleven(23));
    }
    public static boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }
}
