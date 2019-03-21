package jgc;

/**
 * 要点：使用linkedlist做队列
 */

import java.util.LinkedList;
import java.util.List;

public class No933_Number_of_Recent_Calls {
    private List<Integer> list = new LinkedList<>();

    public No933_Number_of_Recent_Calls() {

    }

    public int ping(int t) {
        while (!list.isEmpty() && list.get(0) < t - 3000) {
            list.remove(0);
        }
        list.add(t);
        return list.size();
    }
}
