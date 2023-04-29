package warmup1;
public class C17_startHi {
    /*
    Question:

    Given a string, return true if the string starts with "hi" and false otherwise.

    startHi("hi there") → true
    startHi("hi") → true
    startHi("hello hi") → false
    */
    public static void main(String[] args) {
        System.out.println(startHi("hello hi"));
    }
    public static boolean startHi(String str) {
        if(str.startsWith("hi")){
            return true;
        }else{
            return false;
        }
    }

}
