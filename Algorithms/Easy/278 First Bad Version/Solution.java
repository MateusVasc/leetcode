/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int leftP = 1;
        int rightP = n;

        while (leftP < rightP) {
            int midP = leftP + (rightP - leftP) / 2;

            if (isBadVersion(midP)) {
                rightP = midP;
            } else {
                leftP = midP + 1;
            }
        }

        return leftP;
    }
}