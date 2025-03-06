import java.util.List;

class Solution {
    
    public static List<Integer> reverseArray(List<Integer> a) {
        int pLeft = 0;
        int pRight = a.size() - 1;
        Integer temp;

        while (pRight > pLeft) {
            temp = a.get(pRight);
            a.set(pRight, a.get(pLeft));
            a.set(pLeft, temp);

            pLeft++;
            pRight--;
        }

        return a;
    }
}
