import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    public List<Integer> rotateLeft(int d, List<Integer> arr) {
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < d; i++) {
            temp.add(arr.getFirst());
            arr.removeFirst();
        }

        arr.addAll(temp);

        return arr;
    }
}
