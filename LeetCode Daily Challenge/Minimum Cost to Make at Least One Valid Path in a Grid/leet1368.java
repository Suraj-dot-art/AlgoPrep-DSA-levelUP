class Solution {
    // Direction: right, left, down, up
    int[][] dirs = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    public int minCost(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int[][] minCost = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            Arrays.fill(minCost[row], Integer.MAX_VALUE);
        }
        // element [cost, row, col] / sorted on cost(inc)
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        // insert first element
        pq.offer(new int[] { 0, 0, 0 });
        minCost[0][0] = 0; // cost of source to source

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int cost = curr[0], row = curr[1], col = curr[2];

            // explore only if cost is less than minCost
            if (minCost[row][col] < cost)
                continue;

            for (int dir = 0; dir < 4; dir++) {
                int nextRow = row + dirs[dir][0];
                int nextCol = col + dirs[dir][1];

                // Check if new position is valid
                if (nextRow >= 0 &&
                        nextRow < rows &&
                        nextCol >= 0 &&
                        nextCol < cols) {
                    // if direction is changed then cost will be 1
                    // grid[row][col] -> [1,4]
                    // dir -> [0,3] -> [1,4]
                    int nextCellCost = (dir + 1 == grid[row][col]) ? 0 : 1;
                    int newCost = cost + nextCellCost;

                    if (newCost < minCost[nextRow][nextCol]) {
                        minCost[nextRow][nextCol] = newCost;
                        pq.offer(new int[] { newCost, nextRow, nextCol });
                    }
                }
            }
        }

        return minCost[rows - 1][cols - 1];
    }
}
