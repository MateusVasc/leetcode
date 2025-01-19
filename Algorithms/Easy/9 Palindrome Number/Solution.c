#include <stdbool.h>

bool isPalindrome(int x) {
    if (x < 0)
    {
        return false;
    }
    
    int initNum = x;
    long long finalNum = 0;

    while (x > 9)
    {
        finalNum = (finalNum + x % 10) * 10;
        x /= 10; 
    }
    finalNum += x;

    return initNum == finalNum;
}