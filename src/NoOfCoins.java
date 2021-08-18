import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NoOfCoins {
    private int[] coins;
    private int sum;
    private HashSet results=new HashSet<HashMap<Integer,Integer>>();

    public NoOfCoins(int[] coins, int sum) {
        this.coins = coins;
        this.sum = sum;
    }

    public int combinations() {
        findCombinations(new ArrayList<>(),0);
       return results.size();
    }
    private void findCombinations(ArrayList<Integer> currentCollection,int currentSum)
    {
        if(currentSum==sum)
        {
            addToCollection(currentCollection);
        }else
        {
            for(int coin:coins)
            {
                if(currentSum+coin<=sum)
                {
                    ArrayList<Integer> temp=new ArrayList<>(currentCollection);
                    temp.add(coin);
                    findCombinations(temp,currentSum+coin);
                }
            }
        }

    }

    private void addToCollection(ArrayList<Integer> currentCollection) {
        Map<Integer, Long> temp= currentCollection.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        results.add(temp);
    }
}
