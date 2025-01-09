//LEETCODE 41

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        int i=0;
        while(i<n){
            if(i+1==nums[i]){
                i++;
                continue;
            }
            if(nums[i]>n || nums[i]<=0){
                i++;
                continue;
            }
                int idx1= i;
                int idx2= nums[i]-1;

                if(nums[idx1]==nums[idx2]){
                    i++;
                    continue;
                }

                int temp = nums[idx1];
                nums[idx1]= nums[idx2];
                nums[idx2]= temp;
        }
        
        for(int s=0;s<n;s++){
            if(nums[s] != s+1){
                return s+1;
            }
        }
        return n+1;
    }
}