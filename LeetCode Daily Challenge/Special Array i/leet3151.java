class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;

        if (n < 2)
            return true;

        int i = 0;
        int j = 1;
        while (j < n) {
            if (!difParity(nums[i], nums[j])) {
                return false;
            }
            i++;
            j++;
        }

        return true;
    }

    public boolean difParity(int x, int y) {
        if (x % 2 == 0) {
            if (y % 2 == 1) {
                return true;
            }
        } else if (x % 2 == 1) {
            if (y % 2 == 0) {
                return true;
            }
        }
        return false;
        // return (x % 2) != (y % 2);
    }
}