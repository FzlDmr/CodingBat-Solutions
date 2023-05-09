package functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C01_noNeg {
    /*
    Question:"

    Given a list of integers, return a list of the integers, omitting any that are less than 0.

    noNeg([1, -2]) → [1]
    noNeg([-3, -3, 3, 3]) → [3, 3]
    noNeg([-1, -1, -1]) → []
    */
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(-3);
        arr.add(-3);
        arr.add(3);
        arr.add(3);
        System.out.println(noNeg(arr));
    }
    public static List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(t->t>=0).collect(Collectors.toList());
    }

}
