#include <stdlib.h>

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) 
{
    *returnSize = 2;
    int *outArr = malloc(*returnSize * sizeof(int));

    for (int i = 0; i < numsSize - 1; i++)
    {
        for (int j = i + 1; j < numsSize; j++)
        {
            if (nums[i] + nums[j] == target)
            {
                outArr[0] = i;
                outArr[1] = j;

                return outArr;
            }
            
        }
        
    }

    return outArr;
}

typedef struct Entry
{
    int key;
    int value;
    struct Entry* next;
} Entry;


typedef struct Hashmap
{
    Entry** table;
    int size;
} Hashmap;
