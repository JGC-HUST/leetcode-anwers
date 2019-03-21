package jgc;

public class No832_Flipping_an_Image {
    public int[][] flipAndInvertImage(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int temp;
        for (int i = 0; i < row; i++) {
            // reverse
            for (int j = 0; j < col/2; j++) {
                temp = A[i][j];
                A[i][j] = 1 - A[i][col - j - 1];
                A[i][col - j - 1] = 1 - temp;
            }
            if (col % 2 != 0) {
                A[i][col / 2] = 1 - A[i][col / 2];
            }
        }
        return A;
    }
}
