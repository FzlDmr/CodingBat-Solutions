package string2;

public class C01_doubleChar {
    /*
    Question:

    Given a string, return a string where for every char in the original, there are two chars.

    doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree"
    */
    public static void main(String[] args) {
        System.out.println(doubleChar("Hi-There"));
    }

    public static String doubleChar(String str) {
        String a="";
        for(int i=0; i<str.length();i++){
            a+=str.charAt(i);
            a+=str.charAt(i);
        }
        return a;

    }

}
