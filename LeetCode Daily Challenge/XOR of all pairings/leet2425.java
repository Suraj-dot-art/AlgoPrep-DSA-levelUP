class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        if (m % 2 == 0 && n % 2 == 0) { // dono even he to
            return 0;
        } else if (m % 2 != 0 && n % 2 != 0) { // dono odd he to
            int res1 = bitWiseXor(nums1);
            int res2 = bitWiseXor(nums2);
            return res1 ^ res2;
        } else {
            if (m % 2 == 0) { // if nums1 is even
                return bitWiseXor(nums1);
            } else { // if nums2 is even
                return bitWiseXor(nums2);
            }
        }
    }

    public int bitWiseXor(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
}
