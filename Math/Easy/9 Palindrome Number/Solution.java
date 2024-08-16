class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reversed = 0;

        while (original > 0) {
            int lastDigit = original % 10;
            reversed = reversed * 10 + lastDigit;
            original /= 10;
        }

        return x == reversed;
    }

    // Solution transforming into a string

    // public boolean isPalindrome(int x) {
    // StringBuilder original = new StringBuilder(String.valueOf(x));
    // StringBuilder reversed = new StringBuilder(original);

    // return original.toString().equals(reversed.reverse().toString());
    // }
}