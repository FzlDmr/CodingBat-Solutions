package warmup1;

public class C23_startOz {
    /*
    Question:

    Given a string, return a string made of the first 2 chars (if present),
    however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

    startOz("ozymandias") → "oz"
    startOz("bzoo") → "z"
    startOz("oxx") → "o"
    */
    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
    }
    public static String startOz(String str) {
        if(str.length()>=1){
            if(str.startsWith("oz")){
                return "oz";
            }else if(str.startsWith("o")){
                return "o";
            }else if(str.substring(1,2).equals("z")){
                return "z";
            }return "";
        }return "";

    }

}
