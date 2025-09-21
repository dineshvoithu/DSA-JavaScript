import java.util.Arrays;

public class Anagram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();

        Arrays.sort(sSort);
        Arrays.sort(tSort);

        return Arrays.equals(sSort, tSort);

    }

    public static void main(String[] args) {

        Anagram obj = new Anagram();

        System.out.println(obj.isAnagram("anagram", "nagaram"));
        System.out.println(obj.isAnagram("rat", "car"));

    }
}
