package functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C04_noZ {
    /*
    Question:

    Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)

    noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
    noZ(["hziz", "hzello", "hi"]) → ["hi"]
    noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
    */
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("hziz");
        arr.add("hzello");
        arr.add("hi");
        System.out.println(noZ(arr));
    }
    public static List<String> noZ(List<String> strings) {
        return strings.stream().filter(t->!(t.contains("z"))).collect(Collectors.toList());
    }

}
