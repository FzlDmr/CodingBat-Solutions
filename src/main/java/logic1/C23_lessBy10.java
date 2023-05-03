package logic1;

public class C23_lessBy10 {
    /*
    Question:

    Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

    lessBy10(1, 7, 11) → true
    lessBy10(1, 7, 10) → false
    lessBy10(11, 1, 7) → true
    */
    public static void main(String[] args) {
        System.out.println(lessBy10(1, 7, 10));
    }
    public static boolean lessBy10(int a, int b, int c) {
        int fark1 = Math.abs(a-b);
        int fark2 =Math.abs(b-c);
        int fark3 =Math.abs(a-c);

        return fark1 >= 10 || fark2 >= 10 || fark3 >= 10;
    }


}
