package string1;

public class C14_withouEnd2 {
    /*
    Question:

    Given a string, return a version without both the first and last char of the string.
    The string may be any length, including 0.

    withouEnd2("Hello") → "ell"
    withouEnd2("abc") → "b"
    withouEnd2("ab") → ""
    */
    public static void main(String[] args) {
        System.out.println(withouEnd2("abc"));
    }
    public static String withouEnd2(String str) {
        if(str.length()>2){
            return str.substring(1,str.length()-1);
        }else{
            return "";
        }
    }


}
