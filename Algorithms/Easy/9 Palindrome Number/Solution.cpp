#include <iostream>

class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long long num = x;
        long long reversed = 0;

        while (num > 9) {
            reversed = (reversed + num % 10) * 10;
            num /= 10;
        }
        reversed += num;

        return x == reversed;
    }
};