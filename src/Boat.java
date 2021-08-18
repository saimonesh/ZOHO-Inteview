public class Boat {
    int[][] mat;

    public Boat(int[][] mat) {
        this.mat = mat;
    }

    public int res() {
        int total_boats = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j=0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    total_boats++;
                    mat[i][j] = 0;
                    makeAdjElementsZero(i, j);
                }
            }

        }
        return total_boats;
    }

    private void makeAdjElementsZero(int i, int j) {
        boolean exec=false;
        if (mat[i + 1][j] == 1 || mat[i][j + 1] == 1) {
            while (i + 1 < mat.length && j + 1 < mat[0].length && mat[i + 1][j] == 1 && mat[i][j + 1] == 1 && mat[i + 1][j + 1] == 1) {
                mat[i + 1][j] = 0;
                mat[i][j + 1] = 0;
                mat[i + 1][j + 1] = 0;
                i++;
                j++;
                exec=true;
            }
            if(exec)return;
            while (i + 1 < mat[i].length && mat[i + 1][j] == 1  && (j+1==mat[0].length||mat[i][j + 1] == 0)) {
                mat[i + 1][j] = 0;
                i++;
                exec=true;
            }
            if(exec)return;
            while (j + 1 < mat[i].length && (i+1==mat[0].length ||mat[i + 1][j] == 0) && mat[i][j + 1] == 1) {
                mat[i][j + 1] = 0;
                j++;
            }
        }
    }
}
