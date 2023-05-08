package functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C02_square {
    /*
    Question:

    Given a list of integers, return a list where each integer is multiplied with itself.

    square([1, 2, 3]) → [1, 4, 9]
    square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
    square([]) → []
    */
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(6);
        arr.add(8);
        arr.add(6);
        arr.add(8);
        arr.add(-1);
        System.out.println(square(arr));
    }
    public static List<Integer> square(List<Integer> nums) {
        return nums.stream().map(t->t*t).collect(Collectors.toList());
    }
}
