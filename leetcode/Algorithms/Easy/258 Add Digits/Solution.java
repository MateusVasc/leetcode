class Solution {
    public int addDigits(int num) {
        int curr = num;

        while (curr >= 10) {
            curr = sumDigits(curr);
        }

        return curr;
    }

    public int sumDigits(int num) {
        int curr = num;
        int sum = 0;

        while (curr > 0) {
            int rem = curr % 10;
            curr = curr / 10;
            sum += rem;
        }

        return sum;
    }
}