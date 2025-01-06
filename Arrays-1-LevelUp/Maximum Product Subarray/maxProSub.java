//LEETCODE 152
class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;

        int pre = 1;
        int suf = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pre == 0)
                pre = 1;
            if (suf == 0)
                suf = 1;

            pre = pre * arr[i];
            suf = suf * arr[n - 1 - i];
            max = Math.max(Math.max(pre, max), Math.max(suf, max));
        }
        return max;
    }
}

// ANTOHER WAY TO WRITE
// class Solution {
// public int maxProduct(int[] nums) {
// int n = nums.length;
// int max= nums[0];
// int min= nums[0];
// int ans= nums[0];

// for(int i=1;i<n;i++){
// if(nums[i]<0){
// int temp = max;
// max=min;
// min=temp;
// }
// max=Math.max(nums[i],max*nums[i]);
// min=Math.min(nums[i],min*nums[i]);
// ans = Math.max(ans,max);
// }
// return ans;
// }
// }