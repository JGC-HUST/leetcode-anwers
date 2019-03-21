package jgc;

public class No_821_Shortest_Distance_to_a_Character {
    public int distance(int a, int b) {
        if (a < 0 || b < 0) {
            return 999;
        }
        return a < b ? (b - a) : (a - b);
    }
    public int[] shortestToChar(String S, char C) {
        int len = S.length();
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = distance(S.indexOf(C, i), i) < distance(S.lastIndexOf(C, i), i) ? distance(S.indexOf(C, i), i) : distance(S.lastIndexOf(C, i), i);
        }
        return result;
    }
}
