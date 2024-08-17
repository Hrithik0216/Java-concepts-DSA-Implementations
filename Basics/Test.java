package Basics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static boolean palindrome(String s) {
        String palinResult = s.toLowerCase();
        int i = 0, j = palinResult.length() - 1;

        while (i <= j) {
            if (palinResult.charAt(i) != palinResult.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static boolean palindromeNum(int num) {
        int num2 = num;
        int result = 0;
        num = Math.abs(num);
        while (num > 0) {
            int rem = num % 10;
            result = result * 10 + rem;
            num = num / 10;
        }
        if (num2 != result) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        String s = "Hello world";
        String[] st = s.split(" ");
        StringBuilder sb = new StringBuilder();
        char character = 'a';
        int asc = character - (int) 'a';
        System.out.println(asc);
        for (int i = st.length - 1; i > 0; i--) {
            sb.append(st[i]);
            sb.append(" ");
        }
        sb.append(st[0]);
        System.out.println(sb.toString());
        String test = "Hrithik";
        System.out.println(test.substring(1, 4));

        String[] sub = new String[]{"geeksforgeeks", "geeks", "geek", "geezer"};
        String result = sub[1];
        for (int i = 0; i < sub.length; i++) {
            while (sub[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
            }
        }
        System.out.println(result);

        boolean a = s.equalsIgnoreCase("hello world");
        System.out.println(a);
        char[] chArr = s.toCharArray();
        for (char i : chArr) {
            System.out.print(i);
        }
        String g = "chill";
        System.out.println(g.compareToIgnoreCase("children"));
        System.out.println(s.equals("Hello"));

//       for(Character key: map.keySet()){
//           System.out.println(key);
//       }
//       for(Integer value: map.values()){
//           System.out.println(value);
//       }
        Map<Character, Integer> map2 = new HashMap<>();
        map2.put('I', 1);
        map2.put('V', 5);
        map2.put('X', 10);
        map2.put('L', 50);
        map2.put('C', 100);
        map2.put('D', 500);
        map2.put('M', 1000);
        int total = 0;
        String roman = "XL";
        for (int i = 0; i < roman.length(); i++) {
            if (i > 0 && map2.get(roman.charAt(i)) > map2.get(roman.charAt(i - 1))) {
                total += map2.get(roman.charAt(i)) - 2 * map2.get(roman.charAt(i - 1));
            } else {
                total += map2.get(roman.charAt(i));
            }
        }
        System.out.println(total);
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        int number = 40; // The integer to convert
        StringBuilder roman2 = new StringBuilder();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            while (number >= entry.getKey()) {
                roman2.append(entry.getValue());
                number -= entry.getKey();
            }
        }

        System.out.println(roman.toString());
        String countCharacters = "aabbcchhb";
        Map<Character, Integer> countChar = new HashMap<>();
        for (int i = 0; i < countCharacters.length(); i++) {
            char c = countCharacters.charAt(i);
            countChar.put(c, countChar.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countChar.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        String palindromeStr = "madam";
        StringBuilder sbpal = new StringBuilder(palindromeStr);
        String reversed = sbpal.reverse().toString();
        System.out.println(reversed.equals(palindromeStr));
        System.out.print(palindrome(palindromeStr));

        int num = 142;
        System.out.println(palindromeNum(num));
        String hello = "1234";
        System.out.println("The substring value is: ");
        String subSTr = hello.substring(0, 1);
        System.out.println(subSTr);
        System.out.println(hello.length());
    }
}
