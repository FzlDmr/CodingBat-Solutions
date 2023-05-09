package functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C09_noX {
    /*
    Question:

    Given a list of strings, return a list where each string has all its "x" removed.

    noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
    noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
    noX(["x"]) → [""]
    */
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("xxax");
        arr.add("xbxbx");
        arr.add("xxcx");
        System.out.println(noX(arr));
    }
    public static List<String> noX(List<String> strings) {
        return strings.stream().map(t->t.replaceAll("x","")).collect(Collectors.toList());
    }
}
