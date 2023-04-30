package warmup2;

import java.util.Arrays;

public class C12_stringX {
    /*
    Question:

    Given a string, return a version where all the "x" have been removed.
    Except an "x" at the very start or end should not be removed.

    stringX("xxHxix") → "xHix"
    stringX("abxxxcd") → "abcd"
    stringX("xabxxxcdx") → "xabcdx"
    */
    public static void main(String[] args) {

        System.out.println(stringX("xxHxix"));

    }

    public static String stringX(String str) {
        String result = "";

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'x') {
                if(i == 0 || i == str.length() - 1) {
                    result += 'x';
                }
            } else {
                result += str.charAt(i);
            }
        }

        return result;
    }


}
