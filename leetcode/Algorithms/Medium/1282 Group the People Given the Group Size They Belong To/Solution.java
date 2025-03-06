import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> output = new ArrayList<>();

        Map<Integer, List<Integer>> map = getSizeToPeopleMap(groupSizes);

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int size = entry.getKey();
            List<Integer> people = entry.getValue();

            for (int i = 0; i < people.size(); i += size) {
                output.add(people.subList(i, i + size));
            }
        }

        return output;
    }

    public Map<Integer, List<Integer>> getSizeToPeopleMap(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            if (!map.containsKey(size)) {
                map.put(size, new ArrayList<>());
            }

            map.get(size).add(i);
        }

        return map;
    }
}