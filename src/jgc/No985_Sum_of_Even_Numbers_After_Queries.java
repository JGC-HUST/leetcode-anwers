package jgc;

public class No985_Sum_of_Even_Numbers_After_Queries {
    public int count(int[] A) {
        int sum = 0;
        for (int i :
                A) {
            sum += (i % 2 == 0) ? i : 0;
        }
        return sum;
    }
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int len = queries.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            A[queries[i][1]] += queries[i][0];
            result[i] = count(A);
        }
        return result;
    }
}

