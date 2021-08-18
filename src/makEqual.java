public class makEqual {
    public boolean makeEqual(String[] words) {
        int[] data=new int[26];
        for(String s : words)
        {
            for(Character c:s.toCharArray())
            {
                data[(c-'0')-49]++;
            }
        }
        for(int t:data)
        {
            if(t%words.length!=0)
            {
                return false;
            }
        }
        return true;
    }
}
