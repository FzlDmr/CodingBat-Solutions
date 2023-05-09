package functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C08_lower {
    /*
    Question:

    Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).

    lower(["Hello", "Hi"]) → ["hello", "hi"]
    lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
    lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
    */
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("KitteN");
        arr.add("ChocolaTE");
        System.out.println(lower(arr));
    }
    public static List<String> lower(List<String> strings) {
        return strings.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

}
