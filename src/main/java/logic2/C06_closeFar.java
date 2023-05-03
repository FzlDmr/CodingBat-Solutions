package logic2;

public class C06_closeFar {
    /*
    Question:

    Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
    while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.

    closeFar(1, 2, 10) → true
    closeFar(1, 2, 3) → false
    closeFar(4, 1, 3) → true
    */
    public static void main(String[] args) {
        System.out.println(closeFar(1, 2, 3));
    }

    public static boolean closeFar(int a, int b, int c) {
        int x=Math.abs(a-b);
        int y=Math.abs(a-c);
        int z=Math.abs(b-c);

        return (x<=1 && z>= 2 &&y >= 2
                || y<=1 && z>= 2 &&x >= 2);

    }
}
