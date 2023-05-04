package string2;

public class C20_plusOut {
    /*
    Question:

    Given a string and a non-empty word string,
    return a version of the original String where all chars have been replaced by pluses ("+"),
    except for appearances of the word string which are preserved unchanged.

    plusOut("12xy34", "xy") → "++xy++"
    plusOut("12xy34", "1") → "1+++++"
    plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
    */
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34xyabcxy", "xy"));
    }
    public static String plusOut(String str, String word) {
        int wordLen = word.length();
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (i <= str.length() - wordLen && str.substring(i, i + wordLen).equals(word)) {
                result.append(word);
                i += wordLen;
            } else {
                result.append("+");
                i++;
            }
        }
        return result.toString();
    }

}
