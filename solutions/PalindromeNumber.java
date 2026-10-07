import java.util.*;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int orig_num = x;
        int rev_num = 0;

        while (x > 0) {
            int digit = x % 10;
            rev_num = rev_num * 10 + digit;
            x = x / 10;
        }

        return orig_num == rev_num;

    }

}
