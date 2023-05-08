package functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C05_moreY {
    /*
    Question:

    Given a list of strings, return a list where each string has "y" added at its start and end.

    moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
    moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
    moreY(["yay"]) → ["yyayy"]
    */
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        System.out.println(moreY(arr));
    }
    public static List<String> moreY(List<String> strings) {
        return strings.stream().map(t->"y"+t+"y").collect(Collectors.toList());
    }

}
