import javafx.collections.transformation.SortedList;

import java.util.*;

public class maxRemovable {
    public int maximumRemovals(String s, String p, int[] rem) {
        List<Integer> x=new ArrayList<>();
        int l = 0, r = rem.length;
        int[] map = new int[s.length()];
        Arrays.fill(map, rem.length);
        for (int i = 0; i < rem.length; ++i)
            map[rem[i]] = i;
        while (l < r) {
            int m = (l + r + 1) / 2, j = 0;
            for (int i = 0; i < s.length() && j < p.length(); ++i)
                if (map[i] >= m && s.charAt(i) == p.charAt(j))
                    ++j;
            if (j == p.length())
                l = m;
            else
                r = m - 1;
        }
        return l;
    }

    public boolean checkIffine(String p, HashMap<Character, LinkedList<Integer>> sChar) {
        try {
            int i=-1;
            int[] tmp = new int[26];
            for (int j=0; j < p.length(); j++) {
                Character c = p.charAt(j);
                while (sChar.get(c).get(tmp[(c - '0') - 49]) < i) {
                    tmp[(c - '0') - 49]++;
                }
                if (sChar.get(c).get(tmp[(c - '0') - 49]) < i) return false;
                i = sChar.get(c).get(tmp[(c - '0') - 49]);
            }
            return true;

        } catch (Exception ex) {
            return false;
        }
    }
}
