package string3;

public class C03_equalIsNot {
    /*
    Question:

    Given a string, return true if the number of appearances of "is"
    anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).

    equalIsNot("This is not") → false
    equalIsNot("This is notnot") → true
    equalIsNot("noisxxnotyynotxisi") → true
    */
    public static void main(String[] args) {
        System.out.println(equalIsNot("This is not"));
    }
    public static boolean equalIsNot(String str) {
        if(str.isEmpty()){
            return true;
        }
        if(!str.contains("is")&& !str.contains("not")){
            return true;
        }

        if(str.indexOf("is")!=str.lastIndexOf("is") &&
                str.indexOf("not")!=str.lastIndexOf("not") ){
            return true;
        }

        return false;
    }


}
