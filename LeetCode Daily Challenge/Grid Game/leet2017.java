class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long topSum =0;
        long botSum =0;

        int j=0;
        while(j<n){
            topSum += grid[0][j];
            j++;
        }

        long ans = Long.MAX_VALUE;

        for(int i=0;i<n;i++){
            topSum -= grid[0][i];
            ans = Math.min(ans, Math.max(topSum,botSum));
            botSum += grid[1][i];
        }
       
        return ans;
    }
}