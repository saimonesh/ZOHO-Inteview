package Stringsss;

public class hashcode {
    public boolean checkIfStringsareEqual(String s1,String s2)
    {
        s1= "Hello";
        s2="oellH";
        s1.equals(s2);
        return getHashCode(s1)==getHashCode(s2);
    }
    public long getHashCode(String s)
    {
         int p = 31;
         int m = Integer.MAX_VALUE;
         long hash_value = 0;
         long p_pow = 1;
        for (char c : s.toCharArray()) {
            hash_value = (hash_value + (c - 'a' + 1) * p_pow) % m;
            p_pow = (p_pow * p) % m;
        }
        return hash_value;
    }
}
