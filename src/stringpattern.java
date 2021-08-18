import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class stringpattern {
    public List<Integer> findAndReplacePattern(String[] words, String pattern) {
        List<Integer> results = new ArrayList();
        int i=2;
        Integer a=1;

        results.add(1);

       for(int j=0;j<results.size();j++)
       {
        results.add(i++);
       }
        return results;
    }
}
