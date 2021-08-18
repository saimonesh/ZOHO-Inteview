import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_Queen {
    int n;
    List<List<String>> result=new ArrayList();
    public N_Queen(int n) {
        this.n = n;
    }
    public List<List<String>> solveNQueens() {
        String[][] board=new String[n][n];
        for (String[] row : board)
            Arrays.fill(row, ".");
        solve(board,0);
        return  result;
    }
    public void solve(String[][] board, int col)
    {
        if (col>=n)
        {
            addResult(board);
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                if(isSafe(i,col,board))
                {
                    board[i][col]="Q";
                    solve(board,col+1);
                    board[i][col]=".";
                }
            }
        }
    }

    private void addResult(String[][] board) {
        List<String> currentSet=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
           currentSet.add(String.join("",board[i]));
        }
        result.add(currentSet);
    }

    boolean isSafe(int row,int col,String[][]arr)
    {
        for(int i=col-1;i>=0;i--)
        {
            if(arr[row][i].equals("Q"))return false;
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
        {
            if(arr[i][j].equals("Q"))return false;
        }
        for(int i=row+1,j=col-1;i<n&&j>=0;i++,j--)
        {
            if(arr[i][j].equals("Q"))return false;
        }
        return true;
    }
}
