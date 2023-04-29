package warmup2;

public class C06_stringSplosion {
    /*
    Question:

    Given a non-empty string like "Code" return a string like "CCoCodCode".

    stringSplosion("Code") → "CCoCodCode"
    stringSplosion("abc") → "aababc"
    stringSplosion("ab") → "aab"
    */
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
    }
    public static String stringSplosion(String str) {
        String newStr="";

        for(int i=0;i<str.length();i++){
            newStr+=str.substring(0,i+1);

        }return newStr;
    }

}
