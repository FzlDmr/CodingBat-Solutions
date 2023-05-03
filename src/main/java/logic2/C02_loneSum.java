package logic2;

public class C02_loneSum {
    /*
    Question:

    Given 3 int values, a b c, return their sum.
    However, if one of the values is the same as another of the values, it does not count towards the sum.

    loneSum(1, 2, 3) → 6
    loneSum(3, 2, 3) → 2
    loneSum(3, 3, 3) → 0
    */
    public static void main(String[] args) {
        System.out.println(loneSum(3, 2, 3));
    }
    public static int loneSum(int a, int b, int c) {
        int sum=0;

        if(a==b && b==c){
            return sum;
        }

        if(a!=b && b!=c && c!=a){
            return a+b+c;
        }
        if(a==b){
            return sum+=c;
        }
        if(a==c){
            return sum+=b;
        }
        return sum += a;

    }
}
