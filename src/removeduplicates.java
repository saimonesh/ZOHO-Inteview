import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class removeduplicates {
String[]  paths;

    public removeduplicates(String[] paths) {
        this.paths = paths;
    }
    public List<List<String>> remove()
    {
        List<List<String>> temp=new ArrayList<>();
        HashMap<String, List<String>> duplicates=new HashMap<>();
        for(String path : paths)
        {
            String[] infos=path.split(" ");
            String pathName=infos[0];
            for(int i=1;i<infos.length;i++)
            {
                String file=infos[i];
                String fileContent=file.substring(file.indexOf('('));
                duplicates.computeIfAbsent(fileContent,l->new ArrayList<>()).add(pathName+"/"+file.replace(fileContent,""));
            }
        }
        temp=new ArrayList<>(duplicates.values().stream().parallel().filter(l->l.size()>1).collect(Collectors.toList()));
        return temp;
    }
}
