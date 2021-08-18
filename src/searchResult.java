import java.util.*;
import java.util.stream.Collectors;

public class searchResult {
    public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
        Collections.sort(repository);
        List<List<String>> output=new ArrayList<>();
        List<String> res=repository.stream().map(l->l.toLowerCase()).filter(l->l.startsWith(customerQuery.toLowerCase().substring(0,2))).limit(3l).collect(Collectors.toList());
        Collections.sort(res);
        output.addAll(Collections.singleton(res));
        if(res.size()>0)
        {
            for(int i=3;i<=customerQuery.length();i++)
            {
                int temp=i;
                res=res.stream().filter(l->l.startsWith(customerQuery.substring(0,temp))).collect(Collectors.toList());
                Collections.sort(res);
                output.addAll(Collections.singleton(res));
            }
        }

        return output;

    }
}
