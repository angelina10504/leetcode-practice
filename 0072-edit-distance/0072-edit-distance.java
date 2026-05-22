class Solution {
    int[][] memo;
    public int minDistance(String word1, String word2) {
        memo=new int[word1.length()+1][word2.length()+1];
        for(int[]row: memo)Arrays.fill(row,-1);
        return solve(word1,word2,0,0);
    }
    private int solve(String word1, String word2,int i, int j){
        //base case
        if(i==word1.length())return word2.length()-j;
        if(j==word2.length())return word1.length()-i;

        if(memo[i][j]!=-1)return memo[i][j];

        if(word1.charAt(i)==word2.charAt(j))
        {
            memo[i][j]=solve(word1,word2,i+1,j+1);
        }
        else{
            int del = solve(word1,word2,i+1,j);
            int rep= solve(word1,word2,i+1,j+1);
            int in = solve(word1, word2,i,j+1);
            memo[i][j]=Math.min(del,Math.min(rep,in))+1;
        }
        return memo[i][j];
    }
}