package functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C04_copies3 {
    /*
    Question:

    Given a list of strings, return a list where each string is
    replaced by 3 copies of the string concatenated together.

    copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
    copies3(["24", "a", ""]) → ["242424", "aaa", ""]
    copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
    */
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("bb");
        arr.add("ccc");
        System.out.println(copies3(arr));
    }
    public static List<String> copies3(List<String> strings) {
        return strings.stream().map(t->t+t+t).collect(Collectors.toList());
    }
}
