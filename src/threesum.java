import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class threesum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, Integer> dataMap = new HashMap<>();
        for (int x : nums) {
            dataMap.computeIfAbsent(x, l -> l = 0);
            dataMap.compute(x, (l, v) -> v + 1);
        }
        while (!dataMap.isEmpty()) {
            int x=dataMap.keySet().iterator().next();
            dataMap.compute(x, (k, v) -> v - 1);
            res.add(solve2Sum(x, nums, dataMap));
        }
        return null;
    }

    private ArrayList<Integer> solve2Sum(int x, int[] nums, Map<Integer, Integer> dataMap) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int y : dataMap.keySet()
        ) {
            int z = -(x + y);
            if (dataMap.containsKey(z)) {
                if (dataMap.get(z) > 0) {
                    temp.add(y);
                    temp.add(z);
                    temp.add(x);

                    dataMap.compute(z, (k, v) -> v - 1);
                    dataMap.compute(y, (k, v) -> v - 1);
                    if (dataMap.get(z) == 0)
                        dataMap.remove(z);
                    if (dataMap.get(y) == 0)
                        dataMap.remove(y);
                    if (dataMap.get(x) == 0)
                        dataMap.remove(x);
                    return temp;
                }
            }
        }
        return temp;
    }
}
