public class matrix90 {
    private  int row;
    private  int col;
    int[][] mat;

    public matrix90(int[][] mat) {
        this.mat = mat;
        this.row=mat.length;
        this.col=mat[0].length;
    }
    public int[][] rotate()
    {
        int[][] rotatedMatrix=new int[mat.length][mat[0].length];
        int l=0,k=0;
        for(int i=0;i<row;i++)
        {
            k=0;
            for(int j=col-1;j>=0;j--)
            {
                rotatedMatrix[l][k]=mat[j][i];
                k++;
            }
            l++;
        }
        return rotatedMatrix;
    }
}
