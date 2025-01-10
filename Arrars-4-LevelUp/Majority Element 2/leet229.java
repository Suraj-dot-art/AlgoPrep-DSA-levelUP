class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        int val1 = nums[0];
        int count1 = 1;
        int val2 = -1;
        int count2 = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] == val1) {
                count1++;
            } else if (nums[i] == val2) {
                count2++;
            } else if (count1 == 0) {
                val1 = nums[i];
                count1++;
            } else if (count2 == 0) {
                val2 = nums[i];
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        int freq1 = 0;
        int freq2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == val1) {
                freq1++;
            } else if (nums[i] == val2) {
                freq2++;
            }
        }
        if (freq1 > n / 3) {
            list.add(val1);
        }
        if (freq2 > n / 3) {
            list.add(val2);
        }

        return list;
    }
}