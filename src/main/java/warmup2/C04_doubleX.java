package warmup2;

public class C04_doubleX {
    /*
    Question:

    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true
    */

    public static void main(String[] args) {
        System.out.println(doubleX("axaxax"));
    }

    public static boolean  doubleX(String str) {
        int a = str.indexOf("x");
        if(a == -1){
            return false;
        }

        if(a+1 >= str.length()) {
            return false;
        }

        return str.substring(a+1,a+2).equals("x");
    }


}
