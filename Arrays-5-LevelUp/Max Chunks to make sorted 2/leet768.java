// hint -- find the max till ith and min til i+1 and compare it u will get it
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int count = 0;
        int max = Integer.MIN_VALUE;

        int[] pmax = new int[n];
        pmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pmax[i] = Math.max(arr[i], pmax[i - 1]);
        }

        int[] smin = new int[n];
        smin[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            smin[i] = Math.min(arr[i], smin[i + 1]);
        }

        for (int i = 0; i < n - 1; i++) {
            if (pmax[i] <= smin[i + 1]) {
                count++;
            }
        }
        return count + 1;
    }
}
