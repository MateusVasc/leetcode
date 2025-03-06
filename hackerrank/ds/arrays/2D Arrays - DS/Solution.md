# 2D Array - Hourglass Sum

## Problem Description

Given a 2D array, an hourglass is a subset of values with indices falling in the following pattern:

```
a b c
  d
e f g
```

There are 16 hourglasses in a 6x6 array. The hourglass sum is the sum of the values in an hourglass. Calculate the hourglass sum for every hourglass in the array, then print the maximum hourglass sum.

### Example

Given the following 6x6 array:

```
-9 -9 -9  1 1 1 
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0
```

The hourglass sums are:

```
-63 -34 -9  12
-10  0   28 23
-27 -11 -2  10
 9   17  25 18
```

The highest hourglass sum is 28 from the hourglass beginning at row 1, column 2:

```
0 4 3
  1
8 6 6
```

## Function Description

Complete the function `hourglassSum` with the following parameter(s):
- `arr`: a 2-D array of integers

### Returns
- `int`: the maximum hourglass sum

## Input Format
Each of the 6 lines of inputs contains 6 space-separated integers.

## Constraints
- -9 ≤ arr[i][j] ≤ 9
- 0 ≤ i,j ≤ 5

## Sample Input
```
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
```

## Sample Output
```
19
```

## Explanation
The hourglass with the maximum sum (19) is:
```
2 4 4
  2
1 2 4
```