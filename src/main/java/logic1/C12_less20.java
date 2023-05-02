package logic1;

public class C12_less20 {
    /*
    Question:

    Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
    So for example 38 and 39 return true, but 40 returns false.

    less20(18) → true
    less20(19) → true
    less20(20) → false
    */

    public static void main(String[] args) {
        System.out.println(less20(20));
    }
    public static boolean less20(int n) {
        if(n%20==18 || n%20==19){
            return true;
        }else if(n%20==0){
            return false;
        }
        return false;
    }

}
