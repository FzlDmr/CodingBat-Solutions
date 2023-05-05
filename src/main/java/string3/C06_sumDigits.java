package string3;

public class C06_sumDigits {
    /*
   Question:

   Given a string, return the sum of the digits 0-9 that appear in the string,
   ignoring all other characters. Return 0 if there are no digits in the string.
   (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
   Integer.parseInt(string) converts a string to an int.)

   sumDigits("aa1bc2d3") → 6
   sumDigits("aa11b33") → 8
   sumDigits("Chocolate") → 0
   */
    public static void main(String[] args) {
        System.out.println(sumDigits("aa11b33"));
    }

    public static int sumDigits(String str) {
        String str1 = str.replaceAll("[^0-9]", "");

        String arr[] = str1.split("");

        int sum = 0;

        for (String w : arr) {

            for (char c : w.toCharArray()) {

                if (Character.isDigit(c)) {
                    sum = sum + Integer.parseInt(w);
                } else {
                    sum += 0;
                }
            }
        }
        return sum;

    }
}
