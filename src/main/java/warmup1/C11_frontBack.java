package warmup1;

public class C11_frontBack {
    /*
    Question:

    Given a string, return a new string where the first and last chars have been exchanged.

    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
    */
    public static void main(String[] args) {
        System.out.println(frontBack("code"));
    }
    public static String frontBack(String str) {
        if(str.length()>1){
            String orta = str.substring(1,str.length()-1);

            return str.charAt(str.length()-1)+orta+str.charAt(0);
        }else{
            return str;
        }
    }


}

