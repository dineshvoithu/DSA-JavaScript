
public class PalindLeet {

    public static boolean isPalindrome(String s) {

        String alphanumericOnly = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = alphanumericOnly.length() - 1;

        while (left < right) {
            if (alphanumericOnly.charAt(left) != alphanumericOnly.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
