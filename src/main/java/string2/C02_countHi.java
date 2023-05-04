package string2;

public class C02_countHi {
    /*
    Question:

    Return the number of times that the string "hi" appears anywhere in the given string.

    countHi("abc hi ho") → 1
    countHi("ABChi hi") → 2
    countHi("hihi") → 2
    */
    public static void main(String[] args) {
        System.out.println(countHi("ABChi hi"));
    }
    public static int countHi(String str) {
        int count=0;

        for(int i=1; i<str.length();i++){
            if(str.charAt(i-1)=='h' && str.charAt(i)=='i'){
                count++;
            }

        }return count;

    }
}
