package Recursions.SubSequence;

import java.util.ArrayList;
import java.util.List;

public class SubsequencesInAString {
    public static void SubsequencesInAString(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char a = up.charAt(0);
        SubsequencesInAString(p + a, up.substring(1));
        SubsequencesInAString(p, up.substring(1));
    }

    public static ArrayList<String> SubsequencesInAStringList(String p, String up) {
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            System.out.println(p);
            list.add(p);
            return list;
        }
        char a = up.charAt(0);
        ArrayList<String> left = SubsequencesInAStringList(p + a, up.substring(1));
        ArrayList<String> right = SubsequencesInAStringList(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        String s = "abc";
        SubsequencesInAString("", s);

    }
}
