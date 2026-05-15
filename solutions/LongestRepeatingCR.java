package solutions;

public class LongestRepeatingCR {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0, maxf = 0, maxlen = 0;
        int[] arr = new int[26];
        while (r < s.length()) {
            arr[s.charAt(r) - 'A']++;
            maxf = Math.max(maxf, arr[s.charAt(r) - 'A']);
            if ((r - l + 1) - maxf > k) {
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            if ((r - l + 1) - maxf <= k) {
                maxlen = Math.max(maxlen, r - l + 1);
            }
            r++;
        }
        return maxlen;
    }
}
