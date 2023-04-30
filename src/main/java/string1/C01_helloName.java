package string1;

public class C01_helloName {
    /*
    Question:

    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

    helloName("Bob") → "Hello Bob!"
    helloName("Alice") → "Hello Alice!"
    helloName("X") → "Hello X!"
    */

    public static void main(String[] args) {
        System.out.println(helloName("Alice"));
    }

    public static String helloName(String name) {
        return "Hello"+" "+name+"!";

    }

}
