import java.util.List;

public class listofList {
    public int foo(List<String> codeList, List<String> shoppingCart) {

        if(codeList.size()==0)return 1;
        else
        {
            for(int i=shoppingCart.indexOf(codeList.get(0));i<shoppingCart.size();i++)
            {
                int j=0;
                int l=i;
                while(l<shoppingCart.size())
                {
                    if(!codeList.get(j).equals(shoppingCart.get(l)) && !codeList.get(j).equals("anything"))
                    {
                        List<String> subList=shoppingCart.subList(i+1,shoppingCart.size());
                        int indexOfFirstElement=subList.indexOf(codeList.get(0));
                        int indexOfanyThing=subList.indexOf(codeList.indexOf("anything"));
                        if(indexOfFirstElement!=-1 && indexOfanyThing!=-1)
                        {
                            i=Math.min(indexOfFirstElement,indexOfanyThing);
                        }else if(indexOfFirstElement==-1 && indexOfanyThing==-1)
                        {
                            i=shoppingCart.size();
                        }else if(indexOfFirstElement==-1&& indexOfanyThing!=-1)
                        {
                            i=indexOfanyThing;
                        }else
                        {
                            i=indexOfFirstElement;
                        }
                        j=0;
                        break;
                    }else
                    {
                        j++;
                        l++;
                    }
                }
                if(j==codeList.size())
                {
                    return 1;
                }
            }
            return 0;
        }

    }
}
