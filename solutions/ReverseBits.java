package solutions;

public class ReverseBits {
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i <= 31; i++) {
            rev = rev << 1;
            System.out.println(rev);
            int lastbit = n % 2;
            rev += lastbit;
            n = n >> 1;
        }
        return rev;
    }
}
