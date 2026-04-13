import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        int aux = 0;
        List<Integer> lastList = new ArrayList<>();

        while (aux <= rowIndex) {
            List<Integer> auxList = new ArrayList<>();
            auxList.add(1);

            if (aux > 1) {
                int i = 1;

                while (i < aux) {
                    auxList.add(lastList.get(i - 1) + lastList.get(i));
                    i++;
                }
            }

            if (aux > 0) auxList.add(1);
            lastList = auxList;
            aux++;
        }

        return lastList;
    }
}