package jgc;

import java.util.HashSet;
import java.util.Set;

public class No061_N_Repeated_Element_in_Size_2N_Array {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (!set.add(A[i])) {
                return A[i];
            }
        }
        // 这里的return 0仅仅是为了符合java语法
        return 0;
    }
}
