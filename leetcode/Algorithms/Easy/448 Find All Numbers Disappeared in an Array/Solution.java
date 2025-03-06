import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int count = 1;
        int limit = nums.length;

        while (count < limit) {
            ans.add(count);

            for (int i = 0; i < limit; i++) {
                if (count == nums[i]) {
                    ans.remove(count - 1);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int nums[] = {4,3,2,7,8,2,3,1};

        List<Integer> l = s.findDisappearedNumbers(nums);
        System.out.println(l.toString());
    }
}