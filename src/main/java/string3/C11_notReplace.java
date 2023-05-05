package string3;

public class C11_notReplace {
    /*
    Question:

    Given a string, return a string where every appearance of the lowercase word "is"
    has been replaced with "is not". The word "is" should not be
    immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count.
    (Note: Character.isLetter(char) tests if a char is a letter.)

    notReplace("is test") → "is not test"
    notReplace("is-is") → "is not-is not"
    notReplace("This is right") → "This is not right"
    */
    public static void main(String[] args) {
        System.out.println(notReplace("This is right"));
    }
    public static String notReplace(String str) {

        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) {
                if ((i == 0 || !Character.isLetter(str.charAt(i - 1))) &&
                        (i + 2 == str.length() || !Character.isLetter(str.charAt(i + 2)))) {
                    result.append("is not");
                    i += 2;
                    continue;
                }
            }
            result.append(str.charAt(i));
            i++;
        }
        return result.toString();
    }

}
