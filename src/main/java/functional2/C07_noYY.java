package functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C07_noYY {
    /*
    Question:

    Given a list of strings, return a list where each string has "y" added at its end,
    omitting any resulting strings that contain "yy" as a substring anywhere.

    noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
    noYY(["a", "b", "cy"]) → ["ay", "by"]
    noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
    */
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("xx");
        arr.add("ya");
        arr.add("zz");

        System.out.println(noYY(arr));
    }

    public static List<String> noYY(List<String> strings) {
        return strings.stream().filter(t -> !t.endsWith("y") && !t.contains("yy")).map(t -> t + "y").collect(Collectors.toList());

    }


}