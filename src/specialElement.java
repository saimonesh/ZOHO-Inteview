import java.util.HashSet;

public class specialElement {
    public specialElement(int[][] mat) {
        this.mat = mat;
    }

    int[][] mat;

    public int getElement() {
        HashSet<Integer> temp = new HashSet<>();
        for (int i = 0; i < mat.length; i++) {
            int row_min = mat[i][0];
            int row_max = mat[i][0];
            int col_min= mat[i][0];
            int col_max=mat[i][0];
            for (int j = 1; j < mat[0].length; j++) {
                row_min = Integer.min(mat[i][j], row_min);
                row_max = Integer.max(mat[i][j], row_max);
                col_min = Integer.min(mat[j][i],col_min);
                col_max = Integer.max(mat[j][i],col_max);
            }
            temp.add(row_min);
            temp.add(row_max);
            temp.add(col_min);
            temp.add(col_max);
        }

        return temp.size() > 0 ? temp.size() : -1;
    }
}
