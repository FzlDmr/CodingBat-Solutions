package warmup2;

import java.util.Arrays;

public class C11_stringMatch {
    /*
    Question:

    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.


    stringMatch("xxcaazz", "xxbaaz") → 3
    stringMatch("abc", "abc") → 2
    stringMatch("abc", "axc") → 0
    */
    public static void main(String[] args) {

        System.out.println(stringMatch("xxcaazz", "xxbaaz"));

    }


    public static int stringMatch(String a, String b) {
        int count=0;
        int len=Math.min(a.length(),b.length());

        for(int i=1; i<len; i++){
            if(a.substring(i-1,i+1).equals(b.substring(i-1,i+1))){
                count++;
            }
        }

        return count;
    }


}
