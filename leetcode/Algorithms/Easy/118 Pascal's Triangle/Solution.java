import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pTriangle = new ArrayList<>();

        int aux = 1;

        while (aux <= numRows) {
            List<Integer> nxt = new ArrayList<>();

            nxt.add(1);

            if (aux > 2) {
                int idx = 1;

                while (idx < aux - 1) {
                    nxt.add(idx, pTriangle.get(aux - 2).get(idx - 1) + pTriangle.get(aux - 2).get(idx));
                    idx++;
                }
            }

            if (aux > 1) nxt.add(1);
            
            pTriangle.add(nxt);
            aux++;
        }

        return pTriangle;
    }
}