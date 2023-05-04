package string2;

public class C08_xyBalance {
    /*
    Question:

    We'll say that a String is xy-balanced if for all the 'x' chars in the string,
    there exists a 'y' char somewhere later in the string. So "xxy" is balanced,
    but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

    xyBalance("aaxbby") → true
    xyBalance("aaxbb") → false
    xyBalance("yaaxbb") → false
    */
    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbb"));
    }
    public static boolean xyBalance(String str) {

        if(!str.contains("x")&&!str.contains("y")){
            return true;
        }

        if(str.indexOf("x")<str.indexOf("y") && str.lastIndexOf("x")<str.lastIndexOf("y") || str.endsWith("y")){
            return true;
        }return false;
    }

}
