package warmup1;

public class C22_mixStart {
    /*
    Question:

    Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

    mixStart("mix snacks") → true
    mixStart("pix snacks") → true
    mixStart("piz snacks") → false
    */

    public static void main(String[] args) {
        System.out.println(mixStart("piz snacks"));
    }
    public static boolean mixStart(String str) {

        if(str.length()>2){
            if(str.startsWith("mix")){
                return true;
            }else if(str.substring(0,3).contains("ix")){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }

    }

}
