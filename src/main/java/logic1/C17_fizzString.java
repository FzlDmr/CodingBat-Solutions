package logic1;

public class C17_fizzString {
    /*
    Question:

    Given a string str, if the string starts with "f" return "Fizz".
    If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz".
    In all other cases, return the string unchanged.

    fizzString("fig") → "Fizz"
    fizzString("dib") → "Buzz"
    fizzString("fib") → "FizzBuzz"
    */
    public static void main(String[] args) {
        System.out.println(fizzString("fib"));
    }
    public static String fizzString(String str) {
        if(str.startsWith("f")&&str.endsWith("b")){
            return "FizzBuzz";
        }
        else{
            if(str.startsWith("f")){
                return "Fizz";
            }
            else if(str.endsWith("b")){
                return "Buzz";
            }
            return str;
        }
    }
}