package string2;

public class C14_xyzMiddle {
    /*
    Question:

    Given a string, does "xyz" appear in the middle of the string?
    To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
    This problem is harder than it looks.

    xyzMiddle("AAxyzBB") → true
    xyzMiddle("AxyzBB") → true
    xyzMiddle("AxyzBBB") → false
    */
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AxyzBBB"));
    }
    public static boolean xyzMiddle(String str) {
        int len = str.length();
        if (len < 3) {
            return false;
        }
        int mid = len / 2;
        if (len % 2 == 0) {
            if (str.substring(mid - 2, mid + 1).equals("xyz") || str.substring(mid - 1, mid + 2).equals("xyz")) {
                return true;
            } else {
                return false;
            }
        } else {
            if (str.substring(mid - 1, mid + 2).equals("xyz")) {
                return true;
            } else {
                return false;
            }
        }

    }
}
