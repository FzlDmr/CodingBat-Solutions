package warmup1;

public class C04_diff21 {
     /*
     Question:

     Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

     diff21(19) → 2
     diff21(10) → 11
     diff21(21) → 0
     */
     public static void main(String[] args) {
         System.out.println(diff21(10));
     }
    public static int diff21(int n) {
        int fark;
        int result;
        if(n<21){
            fark = n-21;
            result = Math.abs(fark);
            return result;
        }
        else{
            fark = n-21;
            result = Math.abs(fark);
            return 2*result;

        }
    }
}
