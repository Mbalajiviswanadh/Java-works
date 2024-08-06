import java.util.*;
class Solution
{
    
    ArrayList<Integer> search(String p, String t)
    {
        // your code here
        ArrayList<Integer> list = new ArrayList<>();
        
        // for(int i=0;i<=t.length()-p.length();i++){
            
        //     int j=0;
            
        //     while(j<p.length()  && t.charAt(i+j)==p.charAt(j)){
        //         j++;
        //     }
            
        //     if(j==p.length())
        //     list.add(i+1);
        // }
        
        // return list;
        
        // ----- OR-----
        
        for(int i=0;i<=t.length()-p.length();i++){
            
            if(t.charAt(i)==p.charAt(0)){
                
                if(t.substring(i, p.length()+i).equals(p)){
                    list.add(i+1);
                }
            }
        }
        return list;
    }
}