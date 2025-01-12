// The idea is to double the array size hypothetically , rest becomes easy 
// use a stack to store elements greater and smaller than the value 

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int k = i % n;
            while (st.size() != 0 && nums[k] >= st.peek()) {
                st.pop();
            }

            if (i < n) {
                if (st.size() == 0) {
                    ans[i] = -1;
                } else {
                    ans[i] = st.peek();
                }
            }
            st.push(nums[k]);
        }
        return ans;
    }
}
