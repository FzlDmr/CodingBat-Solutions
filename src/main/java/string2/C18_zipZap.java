package string2;

public class C18_zipZap {
    /*
    Question:

    Look for patterns like "zip" and "zap" in the string -- length-3,
    starting with 'z' and ending with 'p'. Return a string where for all such words,
    the middle letter is gone, so "zipXzap" yields "zpXzp".

    zipZap("zipXzap") → "zpXzp"
    zipZap("zopzop") → "zpzp"
    zipZap("zzzopzop") → "zzzpzp"
    */
    public static void main(String[] args) {
        System.out.println(zipZap("zzzopzop"));
    }
    public static String zipZap(String str) {
        String s="";

        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                s+="zp";
                i += 2;  // ortadaki karakteri atlamak için i 2 arttırılır
            } else {
                s+=str.charAt(i);
            }
        }

        return s;
    }

}
