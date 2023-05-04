package string2;

public class C21_wordEnds {
    /*
    Question:

    Given a string and a non-empty word string,
    return a string made of each char just before and just after every appearance of the word in the string.
    Ignore cases where there is no char before or after the word,
    and a char may be included twice if it is between two words.

    wordEnds("abcXY123XYijk", "XY") → "c13i"
    wordEnds("XY123XY", "XY") → "13"
    wordEnds("XY1XY", "XY") → "11"
    */
    public static void main(String[] args) {
        System.out.println(wordEnds("XY123XY", "XY"));
    }
    public static String wordEnds(String str, String word) {
        int wordLen = word.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length() - wordLen + 1; i++) {
            if (str.substring(i, i + wordLen).equals(word)) {
                if (i > 0) {
                    result.append(str.charAt(i - 1));
                }
                if (i < str.length() - wordLen) {
                    result.append(str.charAt(i + wordLen));
                }
            }
        }
        return result.toString();
    }

}
