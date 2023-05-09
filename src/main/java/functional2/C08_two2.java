package functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C08_two2 {
    /*
    Question:

    Given a list of non-negative integers, return a list of those numbers multiplied by 2,
    omitting any of the resulting numbers that end in 2.

    two2([1, 2, 3]) → [4, 6]
    two2([2, 6, 11]) → [4]
    two2([0]) → [0]
    */
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        System.out.println(two2(arr));
    }

    public static List<Integer> two2(List<Integer> nums) {
        return nums.stream().map(t->t*2).filter(t->t%10!=2).collect(Collectors.toList());
    }

}
