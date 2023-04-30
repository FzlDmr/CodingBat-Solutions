package string1;

public class C17_nTwice {
    /*
    Question:

    Given a string and an int n, return a string made of the first and last n chars from the string.
    The string length will be at least n.

    nTwice("Hello", 2) → "Helo"
    nTwice("Chocolate", 3) → "Choate"
    nTwice("Chocolate", 1) → "Ce"
    */
    public static void main(String[] args) {
        System.out.println(nTwice("Chocolate", 3));
    }
    public static String nTwice(String str, int n) {
        if(n>1){
            return str.substring(0,n)+str.substring(str.length()-n);
        }else if(n==1){
            return str.charAt(0)+str.substring(str.length()-1);
        }else{
            return "";
        }
    }

}
