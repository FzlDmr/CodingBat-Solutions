package string3;

public class C08_mirrorEnds {
    /*
    Question:

    Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
    In other words, zero or more characters at the very begining of the given string,
    and at the very end of the string in reverse order (possibly overlapping).
    For example, the string "abXYZba" has the mirror end "ab".

    mirrorEnds("abXYZba") → "ab"
    mirrorEnds("abca") → "a"
    mirrorEnds("aba") → "aba"
    */
    public static void main(String[] args) {
        System.out.println(mirrorEnds("abca"));
    }
    public static String mirrorEnds(String string) {

        int len = string.length();
        String result = "";
        for (int i = 0; i < len; i++) {
            if (string.charAt(i) == string.charAt(len - 1 - i)) {
                result += string.charAt(i);
            } else {
                break;
            }
        }
        return result;
    }

}
