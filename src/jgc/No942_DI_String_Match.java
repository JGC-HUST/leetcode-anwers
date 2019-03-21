package jgc;

public class No942_DI_String_Match {
    public int[] diStringMatch(String S) {
        int len = S.length() + 1;
        int index = 0;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = -1;
        }
        len--;
        while (S.indexOf("I") != -1) {
            result[S.indexOf("I")] = index++;
            S = S.replaceFirst("I", "_");
        }
        while (S.indexOf("D") != -1) {
            result[S.indexOf("D")] = len--;
            S = S.replaceFirst("D", "_");
        }
        result[result.length - 1] = len;
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        new No942_DI_String_Match().diStringMatch("IDID");


    }
}
