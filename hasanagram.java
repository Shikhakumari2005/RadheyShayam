import java.util.*;

public class hasanagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c)) {
                System.out.println("Not Anagram");
                return;
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }

        System.out.println(map.isEmpty() ? "Anagram" : "Not Anagram");
    }
}


