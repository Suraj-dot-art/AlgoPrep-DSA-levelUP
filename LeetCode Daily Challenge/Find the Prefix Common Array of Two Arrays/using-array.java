class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        // Second sol using array

        int n = A.length;
        int ans[] = new int[n];
        int countArray[] = new int[n + 1];
        int common = 0;

        for (int i = 0; i < n; i++) {
            countArray[A[i]] = countArray[A[i]] + 1;
            if (countArray[A[i]] == 2) {
                common++;
            }

            countArray[B[i]] = countArray[B[i]] + 1;
            if (countArray[B[i]] == 2) {
                common++;
            }

            ans[i] = common;

        }
        return ans;
    }
}
