class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        // int ans[] = new int[n];
        // int sum = 0;
        // for(int i=0;i<n;i++){
        // ans[i] = nums[i] + sum;
        // sum = ans[i];
        // }

        // return ans;

        int pf[] = new int[n];
        pf[0] = nums[0];
        for (int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] + nums[i];
        }

        return pf;
    }
}