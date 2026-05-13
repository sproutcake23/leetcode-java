package solutions;

import java.util.*;

public class LongestSubStringWRPC {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> counter = new HashSet<>();
        int maxlen = 0;
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            while (counter.contains(s.charAt(right))) {
                counter.remove(s.charAt(left));
                left++;
            }
            counter.add(s.charAt(right));
            maxlen = Math.max(maxlen, right - left + 1);
            right++;
        }
        return maxlen;
    }
}
