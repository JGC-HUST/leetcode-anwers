package jgc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No905_Sort_Array_By_Parity {
    public int[] sortArrayByParity(int[] A) {
        int len = A.length;
        List<Integer> ol = new ArrayList<>();
        List<Integer> el = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                el.add(A[i]);
            } else {
                ol.add(A[i]);
            }
        }
        el.addAll(ol);
        Integer[] arr = new Integer[len];
        el.toArray(arr);
        for (int i = 0; i < A.length; i++) {
            A[i] = arr[i];
        }
        return A;
    }

    public static void main(String[] args) {
        new No905_Sort_Array_By_Parity().sortArrayByParity(new int[]{1, 2, 3, 4});
    }
}

