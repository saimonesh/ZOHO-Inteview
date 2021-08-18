public class Trie {
    boolean endOfWord;
    class TrieNode{
        TrieNode[] nodes=new TrieNode[26];
        boolean isEndOfWord;
        TrieNode(){
            isEndOfWord=false;
        }
    }
    void insert(String word,TrieNode root)
    {
        TrieNode trav=root;
        for(int i=0;i<word.length();i++)
        {
            while(trav.nodes[word.charAt(i)-'a']!=null)
            {
                trav=trav.nodes[word.charAt(i)-'a'];
            }
        }
    }
}
