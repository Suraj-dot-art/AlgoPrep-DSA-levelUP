public class leet496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] ans = new int[n];

        for (int i = 0; i < m; i++) {
            while (st.size() != 0 && nums2[i] > st.peek()) {
                hm.put(st.pop(), nums2[i]);
            }
            st.push(nums2[i]);
        }

        while (st.size() != 0) {
            hm.put(st.pop(), -1);
        }

        for (int i = 0; i < n; i++) {
            ans[i] = hm.getOrDefault(nums1[i], -1);
        }

        return ans;
    }
}
