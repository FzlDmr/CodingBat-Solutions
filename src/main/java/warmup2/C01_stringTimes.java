package warmup2;

public class C01_stringTimes {
    /*
    Question:

    Given a string and a non-negative int n, return a larger string that is n copies of the original string.


    stringTimes("Hi", 2) → "HiHi"
    stringTimes("Hi", 3) → "HiHiHi"
    stringTimes("Hi", 1) → "Hi"
    */
    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 3));
    }
    public static String stringTimes(String str, int n) {
        String result="";
        for(int i=0; i<n; i++){
            result=result+str;
        }return result;
    }

}
