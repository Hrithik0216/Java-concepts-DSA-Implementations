package Recursions;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<String> permutations(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        List<String> res = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            res.addAll(permutations(f + ch + s, up.substring(1)));
        }
        return res;
    }

    public static void main(String[] args) {
        String p = "";
        String up = "ab";
        List<String> res = permutations(p, up);
        System.out.println(res);
        System.out.println(res.contains("ab"));
    }
}
