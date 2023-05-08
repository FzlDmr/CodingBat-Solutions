package functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C03_addStar {
    /*
    Question:

    Given a list of strings, return a list where each string has "*" added at its end.

    addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
    addStar(["hello", "there"]) → ["hello*", "there*"]
    addStar(["*"]) → ["**"]
    */
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("bb");
        arr.add("ccc");
        System.out.println(addStar(arr));
    }
    public static List<String> addStar(List<String> strings) {
        return strings.stream().map(t->t+"*").collect(Collectors.toList());
    }

}
