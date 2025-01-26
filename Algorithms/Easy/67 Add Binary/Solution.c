#include <stdlib.h>
#include <string.h>

char* addBinary(char* a, char* b) {
    int sizeA = strlen(a);
    int sizeB = strlen(b);

    int sumSize = (sizeA > sizeB) ? sizeA : sizeB;
    char* sum = (char*)malloc(sumSize + 2);

    int carry = 0;
    int i = sumSize;
    sum[i + 1] = '\0';

    int indexA = sizeA - 1;
    int indexB = sizeB - 1;

    while (indexA >= 0 || indexB >= 0 || carry)
    {
        int bitA = (indexA >= 0) ? a[indexA] - '0' : 0;
        int bitB = (indexB >= 0) ? b[indexB] - '0' : 0;

        int sumBits = bitA + bitB + carry;
        sum[i] = (sumBits % 2) + '0';
        carry = sumBits / 2;

        --i;
        --indexA;
        --indexB;
    }
    
    if (carry)
    {
        sum[0] = '1';
        return sum;
    }
    
    return sum + i + 1;
}