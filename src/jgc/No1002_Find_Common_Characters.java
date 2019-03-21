package jgc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class No1002_Find_Common_Characters {
    public List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int len = A.length;
        int value = 0;
        int times = 0;
        for (int i = 0; i < len; i++) {
            String[] temp = A[i].split("");
            Map<String, Integer> localMap = new HashMap<>();
            // 更新localMap
            for (String str :
                    temp) {
                localMap.put(str, localMap.getOrDefault(str, 0) + 1);
            }
            if (map.isEmpty()) {
                map.putAll(localMap);
                continue;
            }
            for (String str :
                    map.keySet()) {
                if (map.get(str) == -1) {
                    continue;
                }
                if (localMap.getOrDefault(str, -1) == -1) {
                    map.put(str, -1);
                    continue;
                }
                if (map.get(str) != localMap.get(str)) {
                    map.put(str, Math.min(map.get(str), localMap.get(str)));
                }
            }
        }
        for (String item :
                map.keySet()) {
            times = map.get(item);
            for (int i = 0; i < times; i++) {
                list.add(item);
            }
        }
        return  list;
    }
}