package string2;

public class C15_getSandwich {
    /*
    Question:

    A sandwich is two pieces of bread with something in between.
    Return the string that is between the first and last appearance of "bread" in the given string,
    or return the empty string "" if there are not two pieces of bread.

    getSandwich("breadjambread") → "jam"
    getSandwich("xxbreadjambreadyy") → "jam"
    getSandwich("xxbreadyy") → ""
    */
    public static void main(String[] args) {
        System.out.println(getSandwich("xxbreadjambreadyy"));
    }
    public static String getSandwich(String str) {
        int breadFirst=str.indexOf("bread");
        int breadLast=str.lastIndexOf("bread");

        if(breadFirst==breadLast){
            return "";
        }
        if(str.contains("bread")){

            return str.substring(breadFirst+5,breadLast);
        }

        return "";
    }

}
