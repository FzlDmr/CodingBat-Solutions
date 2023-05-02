package logic1;

public class C11_old35 {
    /*
    Question:

    Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator

    old35(3) → true
    old35(10) → true
    old35(15) → false
    */
    public static void main(String[] args) {
        System.out.println(old35(15));
    }
    public static boolean old35(int n) {
        if(n%3==0 && n%5==0){
            return false;
        }
        return n % 3 == 0 || n % 5 == 0;
    }

}
