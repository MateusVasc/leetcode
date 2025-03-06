import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String restoreString(String s, int[] indices) {
        Map<Integer, Character> wordMap = new HashMap<>();

        for (int i = 0; i < indices.length; i++) {
            wordMap.put(indices[i], s.charAt(i));
        }

        List<Map.Entry<Integer, Character>> entrys = new ArrayList<>(wordMap.entrySet());
        entrys.sort((a, b) -> a.getKey() - b.getKey());

        StringBuilder shuffledWord = new StringBuilder(entrys.size());

        for (int i = 0; i < entrys.size(); i++) {
            shuffledWord.append(entrys.get(i).getValue());
        }

        return shuffledWord.toString();
    }
}