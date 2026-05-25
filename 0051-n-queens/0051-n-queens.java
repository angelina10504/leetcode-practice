class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result =new ArrayList<>();
        char[][] board = new char[n][n];

        for(char[] row : board) Arrays.fill(row,'.');

        HashSet<Integer> cols = new HashSet<>();
        HashSet<Integer> diag = new HashSet<>();
        HashSet<Integer> antiDiag =  new HashSet<>();

        solve(0,n,board,cols,diag,antiDiag, result);
        return result;
    }
    private void solve (int row,int n, char[][] board,
        HashSet<Integer> cols,
        HashSet<Integer> diag,
        HashSet<Integer> antiDiag,
        List<List<String>>result){

        if (row==n){
            result.add(buildBoard(board));
            return;
        }

        for(int col=0; col<n; col++){
            if (cols.contains(col))continue;
            if(diag.contains(row-col))continue;
            if(antiDiag.contains(row+col))continue;

            board[row][col]='Q';
            cols.add(col);
            diag.add(row-col);
            antiDiag.add(row+col);

            solve(row+1,n,board,cols,diag,antiDiag,result);

            board[row][col]='.';
            cols.remove(col);
            diag.remove(row-col);
            antiDiag.remove(row+col);
        }
        }
        private List<String> buildBoard(char[][] board){
            List<String> current = new ArrayList<>();
            for (char[] row : board){
                current.add(new String(row));
            }
            return current;
        }
}