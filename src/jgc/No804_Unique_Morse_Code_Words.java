package jgc;

import java.util.HashSet;
import java.util.Set;

public class No804_Unique_Morse_Code_Words {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i = 0;i < words.length;i++) {
            char[] chars = words[i].toCharArray();
            String result = "";
            for (int j = 0;j < chars.length;j++) {
                result += morse[chars[j] - 'a'];
            }
            set.add(result);
        }
        return set.size();
    }
}
