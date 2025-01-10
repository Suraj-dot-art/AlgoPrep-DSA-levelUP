class Solution {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        int maxD = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 1) {
                if (index == -1) {
                    maxD = Math.max(maxD, i);
                } else {
                    int mid = (i - index) / 2;
                    maxD = Math.max(maxD, mid);
                }
                index = i;
            }
        }
        maxD = Math.max(maxD, n - 1 - index);
        return maxD;
    }
}
