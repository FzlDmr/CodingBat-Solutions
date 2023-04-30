package string1;

public class C16_endsLy {
    /*
    Question:
    Given a string, return true if it ends in "ly".

    endsLy("oddly") → true
    endsLy("y") → false
    endsLy("oddy") → false
    */
    public static void main(String[] args) {
        System.out.println(endsLy("oddy"));
    }
    public static boolean endsLy(String str) {
        if(str.length()>=2){
            if(str.substring(str.length()-2).equals("ly")){
                return true;
            }else {
                return false;
            }
        }return false;

    }

}
