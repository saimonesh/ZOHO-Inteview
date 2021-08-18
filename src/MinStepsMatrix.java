import java.util.Arrays;

public class MinStepsMatrix {
    public int minPathSum(int[][] grid) {
        try {
            int[][]mem=new int[grid.length][grid[0].length];
            for(int i=0;i<grid.length;i++)
            {
                Arrays.fill(mem[i],-1);
            }
            int res=helper(grid,0,0,0,mem);
            return res;
        }catch (Exception ex)
        {
            System.out.println(ex);
        }
return 0;
    }
    public int helper(int[][] grid,int i,int j,int currentSum,int[][] mem)
    {
        if(i==grid.length-1 && j==grid[i].length-1)
        {
            return currentSum+grid[i][j];
        }else if(mem[i][j]!=-1)return mem[i][j];
        else
        {
            currentSum+=grid[i][j];
            int right=Integer.MAX_VALUE,down=Integer.MAX_VALUE;
            if(j<grid[i].length-1)
            {
                right=helper(grid,i,j+1,currentSum,mem);

            }
            if(i<grid.length-1 )
            {
                down=helper(grid,i+1,j,currentSum,mem);
            }
            int min=Math.min(right,down);
            mem[i][j]=min;
            return min;

        }
    }
}
