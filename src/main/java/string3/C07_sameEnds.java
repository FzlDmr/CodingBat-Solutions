package string3;

public class C07_sameEnds {
    /*
    Question:

    Given a string, return the longest substring that appears at both the beginning
    and end of the string without overlapping. For example, sameEnds("abXab") is "ab".

    sameEnds("abXYab") → "ab"
    sameEnds("xx") → "x"
    sameEnds("xxx") → "x"
    */

    public static void main(String[] args) {
        System.out.println(sameEnds("abXYab"));
    }
    public static String sameEnds(String string) {

        int len = string.length();
        for (int i = len/2; i >= 0; i--) {
            String start = string.substring(0, i);
            String end = string.substring(len-i, len);
            if (start.equals(end)) {
                return start;
            }
        }
        return "";
    }

}
