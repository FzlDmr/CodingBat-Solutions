package string2;

public class C19_starOut {
    /*
    Question:

    Return a version of the given string,
    where for every star (*) in the string the star and the chars
    immediately to its left and right are gone. So "ab*cd" yields
    "ad" and "ab**cd" also yields "ad".

    starOut("ab*cd") → "ad"
    starOut("ab**cd") → "ad"
    starOut("sm*eilly") → "silly"
    */
    public static void main(String[] args) {
        System.out.println(starOut("sm*eilly"));
    }
    public static String starOut(String str) {
        StringBuilder sb = new StringBuilder();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            char currentChar = str.charAt(i);

            if (currentChar == '*') {
                continue;
            }

            if (i > 0 && str.charAt(i-1) == '*') {
                continue;
            }

            if (i < len-1 && str.charAt(i+1) == '*') {
                continue;
            }

            sb.append(currentChar);
        }

        return sb.toString();
    }
}
