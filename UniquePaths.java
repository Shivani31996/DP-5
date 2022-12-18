// Time Complexity :O(m*n)
// Space Complexity :O(m*n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * 1 - Last row and Last column will  be 1 because for last row there is only way which is right direction. For last column,
 * there is only one way which is down direction. So we hardcode this.
 * 2 - We have taken one extra row as precaution so that we do not have to add boundary conditions
 * 3 - While going bottom up, add the elements.
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        
        dp[m-1][n-1] = 1;
        
        for(int i = m-1; i>=0; i--)
        {
            for(int j = n-1; j>=0; j--)
            {
                if(i == m-1 && j == n-1)
                    continue;
                else
                {
                    dp[i][j] = dp[i+1][j] + dp[i][j+1];
                }
            }
        }
        return dp[0][0];
    }
}
