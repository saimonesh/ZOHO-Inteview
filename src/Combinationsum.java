import java.util.ArrayList;
import java.util.List;

public class Combinationsum {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates,target,0,new ArrayList<>());
        return result;
    }

    public void helper(int[] candidates,int target,int currentsum,List<Integer> current)
    {
        if(currentsum == target)
        {
            addToList(new ArrayList<>(current));
        }
        else
        {
            for(int num:candidates)
            {
                if(num+currentsum<=target)
                {
                    current.add(num);
                    currentsum+=num;
                    helper(candidates,target,currentsum,current);
                    currentsum-=num;
                    current.remove(current.size()-1);
                }
            }
        }
    }
    public void addToList(List<Integer> current)
    {
        result.add(current);
    }
}
