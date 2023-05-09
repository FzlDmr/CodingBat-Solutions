package functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C07_rightDigit {
    /*
    Question:

    Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

    rightDigit([1, 22, 93]) → [1, 2, 3]
    rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
    rightDigit([10, 0]) → [0, 0]
    */
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(22);
        arr.add(93);
        System.out.println(rightDigit(arr));
    }
    public static List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(t->t%10).collect(Collectors.toList());
    }

}
