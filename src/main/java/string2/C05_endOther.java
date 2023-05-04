package string2;

public class C05_endOther {
    /*
    Question:

    Given two strings, return true if either of the strings appears at the very end of the other string,
    ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
    Note: str.toLowerCase() returns the lowercase version of a string.

    endOther("Hiabc", "abc") → true
    endOther("AbC", "HiaBc") → true
    endOther("abc", "abXabc") → true
    */
    public static void main(String[] args) {
        System.out.println(endOther("AbC", "HiaBc"));
    }
    public static boolean endOther(String a, String b) {

        if(a.equals(b)){
            return true;
        }

        if(a.length()<b.length()){
            if(b.toLowerCase().endsWith(a.toLowerCase())){
                return true;
            }
        }else if(a.length()>b.length()){
            if(a.toLowerCase().endsWith(b.toLowerCase())){
                return true;
            }
        }

        return false;

    }
}
