package functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C09_square56 {
    /*
    Question:

    Given a list of integers, return a list of those numbers squared and the product added to 10,
    omitting any of the resulting numbers that end in 5 or 6.

    square56([3, 1, 4]) → [19, 11]
    square56([1]) → [11]
    square56([2]) → [14]
    */
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(4);

        System.out.println(square56(arr));
    }
    public static List<Integer> square56(List<Integer> nums) {
        return nums.stream().map(t->t*t).filter(t->t%10!=6 && t%10!=5).map(t->t+10).collect(Collectors.toList());
    }

}
