package jgc;

import java.util.HashSet;
import java.util.Set;

public class No007_Reverse_Integer {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
            if (result * 10 + 9 > Integer.MAX_VALUE || result * 10 - 9 < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return result;
    }
}
