package functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C02_no9 {
    /*
    Question:

    Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)

    no9([1, 2, 19]) → [1, 2]
    no9([9, 19, 29, 3]) → [3]
    no9([1, 2, 3]) → [1, 2, 3]
    */
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(19);
        System.out.println(no9(arr));
    }
    public static List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(t->t%10!=9).collect(Collectors.toList());
    }
}
