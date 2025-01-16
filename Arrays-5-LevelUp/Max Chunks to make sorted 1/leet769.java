class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int chunk = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]); // u r given with 0 to n-1 elements just compare the max to ith position

            if (max == i) {
                chunk++;
            }

        }
        return chunk;
    }
}
