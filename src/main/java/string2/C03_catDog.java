package string2;

public class C03_catDog {
    /*
    Question:

    Return true if the string "cat" and "dog" appear the same number of times in the given string.

    catDog("catdog") → true
    catDog("catcat") → false
    catDog("1cat1cadodog") → true
    */
    public static void main(String[] args) {
        System.out.println(catDog("catcat"));
    }
    public static boolean catDog(String str) {
        int catCount=0;
        int dogCount=0;

        for(int i=0; i<str.length()-2;i++){
            if(str.startsWith("dog", i)){
                dogCount++;
            }else if(str.startsWith("cat", i)){
                catCount++;
            }
        }
        if(dogCount==catCount){
            return true;
        }
        return false;

    }

}
