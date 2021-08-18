import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class longestSequence {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> mySet=new HashMap<>();
        int maxLength=0;
        for(int i=0;i<nums.length;i++)
        {
            int len=0;
            int left=nums[i]-1;
            int right=nums[i]+1;
            mySet.put(nums[i],0);
            len++;

            if(mySet.containsKey(left))
            {
                len+=mySet.get(left);
            }
            if(mySet.containsKey(right))
            {
                len+=mySet.get(right);
            }
            mySet.put(nums[i],len);

            maxLength=Integer.max(maxLength,len);
        }
        return maxLength;
    }
}
