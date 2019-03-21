package jgc;

public class No944_Delete_Columns_to_Make_Sorted {
    public int minDeletionSize(String[] A) {
        int num = 0;
        for (int j = 0; j < A[0].length(); j++) {
            for (int i = 0; i < A.length-1; i++) {
                if (A[i].charAt(j) > A[i+1].charAt(j)) {
                    num++;
                    break;
                }
            }
        }
        return num;
    }
}
