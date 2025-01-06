class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int n = height.length;
        int pm[] = new int[n];
        int sm[] = new int[n];

        pm[0] = height[0];
        sm[n - 1] = height[n - 1];
        for (int i = 1; i < n; i++) {
            pm[i] = Math.max(height[i], pm[i - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            sm[i] = Math.max(height[i], sm[i + 1]);
        }

        for (int i = 1; i < n - 1; i++) {
            int lb = pm[i - 1];
            int rb = sm[i + 1];
            int min = Math.min(lb, rb);

            if (min > height[i]) {
                ans += (min - height[i]);
            }

        }

        return ans;
    }
}