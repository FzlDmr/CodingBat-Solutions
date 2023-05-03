package logic2;

public class C08_evenlySpaced {
    /*
    Question:

    Given three ints, a b c, one of them is small, one is medium and one is large.
    Return true if the three values are evenly spaced,
    so the difference between small and medium is the same as the difference between medium and large.

    evenlySpaced(2, 4, 6) → true
    evenlySpaced(4, 6, 2) → true
    evenlySpaced(4, 6, 3) → false
    */
    public static void main(String[] args) {
        System.out.println(evenlySpaced(4, 6, 3));
    }
    public static boolean evenlySpaced(int a, int b, int c) {

        int max=Math.max(a,b);
        max=Math.max(max,c);

        int min=Math.min(a,b);
        min=Math.min(min,c);

        int ort=0;

        if(max!=a&&min!=a){
            ort=a;
        }
        if(max!=b&&min!=b){
            ort=b;
        }
        if(max!=c&&min!=c){
            ort=c;
        }
        if(max==min){
            return true;
        }

        return    max-ort==ort-min;

    }

}
