package string2;

public class C09_mixString {
    /*
    Question:

    Given two strings, a and b, create a bigger string made of the first char of a,
    the first char of b, the second char of a, the second char of b, and so on.
    Any leftover chars go at the end of the result.

    mixString("abc", "xyz") → "axbycz"
    mixString("Hi", "There") → "HTihere"
    mixString("xxxx", "There") → "xTxhxexre"
    */
    public static void main(String[] args) {
        System.out.println(mixString("xxxx", "There"));
    }

    public static String mixString(String a, String b) {
        int len=Math.min(a.length(),b.length());

        String result="";
        int index=0;

        for(int i=0;i<len;i++){
            result+=a.charAt(i);
            result+=b.charAt(i);
            index++;
        }
        if(a.length()>b.length()){
            result+=a.substring(index);
        }else{
            result+=b.substring(index);
        }

        return result;
    }
}
