public class interleaving {
    public boolean isInterleave(String s1, String s2, String s3) {
        boolean res=check(s1,s2,s3,0);
        return res;
    }
    public boolean check(String s1,String s2,String s3,int i)
    {
        if(i==s3.length())
            if(s1.length()==0 && s2.length()==0)
                return true;
            else return false;
        else
        {
            char s3c=s3.charAt(i);
            boolean a=false,b=false;
            if(s1.length()>0 && s1.charAt(0)==s3c)
                a=check(s1.substring(1),s2,s3,i+1);
            if(s2.length()>0 && s2.charAt(0)==s3c)
                b=check(s1,s2.substring(1),s3,i+1);
            return (a||b);
        }
    }
}
