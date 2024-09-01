package Recursions.SubSequence;

public class RemoveCharactersInAString {
    public static String RemoveChar(String p, String up) {
        if (up.isEmpty()) {
            return p;
        }
        char a = up.charAt(0);
        if (a != 'a') {
            p = p + a;
        }
        return RemoveChar(p, up.substring(1));
    }

    public static String RemoveString(String p, String up) {
        if (up.isEmpty()) {
            return p;
        }
        if (up.startsWith("apple")) {
            return RemoveString(p, up.substring("apple".length()));
        }
        return RemoveString(p + up.charAt(0), up.substring(1));
    }
    public static String RemoveStringAppIfNotApple(String p, String up) {
        if (up.isEmpty()) {
            return p;
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return RemoveString(p, up.substring("apple".length()-2));
        }
        return RemoveString(p + up.charAt(0), up.substring(1));
    }

    public static void main(String[] args) {
        String up = "aaannn";
        String p = " ";
        String a = "appleasdasd";
        String b = "applasdasd";
        System.out.println(RemoveString(" ", a));
        System.out.println(RemoveStringAppIfNotApple(" ", b));

    }
}
