package string1;

public class C33_withoutX2 {
    /*
    Question:

    Given a string, if one or both of the first 2 chars is 'x',
    return the string without those 'x' chars, and otherwise return the string unchanged.
    This is a little harder than it looks.

    withoutX2("xHi") → "Hi"
    withoutX2("Hxi") → "Hi"
    withoutX2("Hi") → "Hi"
    */
    public static void main(String[] args) {
        System.out.println(withoutX2("xaxb"));
    }
    public static String withoutX2(String str) {

        if (str.length()>=2){
            if(str.charAt(1) == 'x' || str.charAt(0) == 'x'){

                if(str.substring(2).contains("x")){

                    return str.substring(1);

                }else{
                    return str.replace("x","");
                }

            }
            else {
                return str;
            }
        }else if (str.length()==0){
            return str = "";
        }
        else {
            return str.replace("x","");
        }


    }

}
