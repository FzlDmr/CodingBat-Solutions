package string2;

public class C12_repeatSeparator {
    /*
    Question:

    Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
    separated by the separator string.

    repeatSeparator("Word", "X", 3) → "WordXWordXWord"
    repeatSeparator("This", "And", 2) → "ThisAndThis"
    repeatSeparator("This", "And", 1) → "This"
    */

    public static void main(String[] args) {
        System.out.println(repeatSeparator("This", "And", 2));
    }
    public static String repeatSeparator(String word, String sep, int count) {
        String s="";
        int sepCount=count;
        for(int i=0 ;i<count; i++){
            s+=word;
            if(sepCount!=1){
                s+=sep;
                sepCount--;
            }

        }return s;
    }


}
