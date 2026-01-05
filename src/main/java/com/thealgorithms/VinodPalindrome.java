public class VinodPalindrome {
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }
}
