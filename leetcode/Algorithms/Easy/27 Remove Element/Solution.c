int removeElement(int* nums, int numsSize, int val) {
    if (numsSize == 0)
    {
        return 0;
    }

    int pLeft = 0;
    int pRight = numsSize - 1;
    int tempArr[numsSize];
    
    for (int i = 0; i < numsSize; i++)
    {
        if (nums[i] == val)
        {
            tempArr[pRight] = nums[i];
            --pRight;
        }
        else
        {
            tempArr[pLeft] = nums[i];
            ++pLeft;
        }
    }

    for (int j = 0; j < numsSize; j++)
    {
        nums[j] = tempArr[j];
    }

    return pRight + 1;
}