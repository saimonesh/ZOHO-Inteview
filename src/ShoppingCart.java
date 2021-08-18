import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShoppingCart {

    public static int foo(List<String> codeList, List<String> shoppingCart) {
        HashMap<String, List<Integer>> locations = new HashMap<>();
        for (int i = 0; i < shoppingCart.size(); i++) {
            locations.computeIfAbsent(shoppingCart.get(i), l -> new ArrayList()).add(i);
        }
        for (String s : codeList) {
            String[] x = s.split(",");
            if (locations.containsKey(x[0])) {
                boolean matched = true;
                for (Integer loc : locations.get(x[0])) {
                    if (shoppingCart.size() - loc >= codeList.size()) {
                        for (String s2 : x) {
                            if (s2.equals(shoppingCart.get(loc)) || s2.equals("anything")) {
                                loc++;
                            } else {
                                matched = false;
                            }
                        }
                    }


                }
                if (matched) return 1;
            }
        }
        return 0;

    }


}
