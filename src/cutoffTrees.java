import java.util.*;

public class cutoffTrees {
    int forest_i;
    int forest_j;
    List<List<Integer>> forest;

    class Visited {
        int i, j;

        public Visited(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Visited visited = (Visited) o;
            return i == visited.i && j == visited.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }
    }

    int cutoffTrees(List<List<Integer>> forest) {
        forest_i = forest.size() - 1;
        forest_j = forest.get(forest_i).size() - 1;
        this.forest = forest;
        return currentPath(0, 0, 0, new ArrayList<>());
    }

    int currentPath(int i, int j, int steps, List<Visited> visited) {
        if (j == forest_j && i == forest_i) return steps+1;
        else if (visited.contains(new Visited(i, j))) return -1;
        else if (forest.get(i).get(j) == 0) return -1;
        else {
            visited.add(new Visited(i, j));
            int goRight = -1, goLeft = -1, goTop = -1, goDown = -1;
            if ((j + 1) <= forest_j) {
                goRight = currentPath(i, j + 1, steps + 1, visited);

            }
            if (j-1 >=0) {
                goLeft = currentPath(i, j - 1, steps + 1, visited);

            }
            if (i+1<=forest_i) {
                goDown = currentPath(i + 1, j, steps + 1, visited);

            }
            if (i-1 >=0) {
                goTop = currentPath(i - 1, j, steps + 1, visited);
            }
            if (goRight == -1) goRight = Integer.MAX_VALUE;
            if (goLeft == -1) goLeft = Integer.MAX_VALUE;
            if (goDown == -1) goDown = Integer.MAX_VALUE;
            if (goTop == -1) goTop = Integer.MAX_VALUE;
            int temp = Math.min(goLeft, Math.min(goRight, Math.min(goTop, goDown)));
            return temp == Integer.MAX_VALUE ? -1 : temp;
        }
    }
}
