public class NQueens {

    public int n;
    public int col = 0;
    public int[][] board = new int[n][n];

    public NQueens(int n) {
        this.n = n;
    }

    public NQueens() {
        n = 8;
    }

    public boolean canPlaceQueen() {
        return true;
    }

    public boolean placeNQueens() {
        if(n < 1)
            throw new IllegalArgumentException("n should be greater than 0");
        for(int i = 0; i < n; i++) {
            if (col >= n) {
                return true;
            }

        }
        return false;
    }

    public void printToConsole() {
        if(placeNQueens()) {
            for (int i = 0; i < board.length; i++) {
                for (int r = 0; r < board[0].length; i++) {
                    if (board[i][r] == 1)
                        System.out.print("Q ");
                    System.out.print(board[r][i] + " ");
                }
                System.out.println();
            }
        }
    }
}
