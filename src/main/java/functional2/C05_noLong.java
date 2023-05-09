package functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C05_noLong {
    /*
    Question:

    Given a list of strings, return a list of the strings, omitting any string length 4 or more.

    noLong(["this", "not", "too", "long"]) → ["not", "too"]
    noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
    noLong(["cccc", "cccc", "cccc"]) → []
    */
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("this");
        arr.add("not");
        arr.add("too");
        arr.add("long");
        System.out.println(noLong(arr));
    }
    public static List<String> noLong(List<String> strings) {
        return strings.stream().filter(t->t.length()<4).collect(Collectors.toList());
    }

}
