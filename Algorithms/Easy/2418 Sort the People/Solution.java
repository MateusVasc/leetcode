import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        List<Map.Entry<Integer, String>> entrys = new ArrayList<>(map.entrySet());
        entrys.sort((a, b) -> b.getKey() - a.getKey());
        String[] sortedNames = new String[names.length];

        for (int i = 0; i < entrys.size(); i++) {
            sortedNames[i] = entrys.get(i).getValue();
        }

        return sortedNames;
    }
}