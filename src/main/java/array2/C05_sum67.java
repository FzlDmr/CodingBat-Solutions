package array2;

public class C05_sum67 {
    /*
    Question:

    Return the sum of the numbers in the array,
    except ignore sections of numbers starting with a 6 and extending to the next 7
    (every 6 will be followed by at least one 7). Return 0 for no numbers.

    sum67([1, 2, 2]) → 5
    sum67([1, 2, 2, 6, 99, 99, 7]) → 5
    sum67([1, 1, 6, 7, 2]) → 4
    */
    public static void main(String[] args) {
        int [] arr ={1, 2, 2, 6, 99, 99, 7};
        System.out.println(sum67(arr));
    }
    public static int sum67(int[] nums) {
        int sum = 0;
        boolean insideBlock = false;
        for (int num : nums) {
            if (num == 6) {
                insideBlock = true;
            } else if (num == 7 && insideBlock) {
                insideBlock = false;
            } else if (!insideBlock) {
                sum += num;
            }
        }
        return sum;
    }

}
