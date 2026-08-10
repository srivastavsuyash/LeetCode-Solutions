class Solution {
    int n, m;
    int dp[][];
    int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

    public int longestIncreasingPath(int[][] matrix) {
        n = matrix.length;
        m = matrix[0].length;
        dp = new int[n][m];
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                ans = Math.max(ans, dfs(i, j, matrix));
            }
        }
        return ans;
    }

    private int dfs(int i, int j, int[][] matrix){
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        int maxPath = 1;
        for(int[] dir : directions){
            int ni = i + dir[0];
            int nj = j + dir[1];
            if(ni >= 0 && ni < n && nj >= 0 && nj < m && matrix[ni][nj] > matrix[i][j]){
                maxPath = Math.max(maxPath, 1 + dfs(ni, nj, matrix));
            }
        }
        dp[i][j] = maxPath;
        return maxPath;
    }
}