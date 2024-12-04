class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        

        int i=0;
        int j=0;

        while(i<str1.length() && j<str2.length()){

            char l = str1.charAt(i);
            char r = str2.charAt(j);

            char increamentval =(char) ('a' + ((l-'a')+1) %26);
            if(l==r || increamentval==r)
            j++;

            i++;
        }

        return j==str2.length();
        
        // OR---
        
        // int i=0;
        // int j=0;

        // StringBuilder s = new StringBuilder();
        // while(i<str1.length() && j<str2.length()){

        //     char l = str1.charAt(i);
        //     char r = str2.charAt(j);
            

        //     char incrementval =(char) ('a' + (((l-'a')+1)%26) );
        //     if(l==r){
        //         s.append(l);
        //         j++;
        //     }
        //     else if(incrementval==r){
        //         s.append(incrementval);
        //         j++;
        //     }
        //     i++;

        // }

        
        // if(s.toString().equals(str2))
        // return true;
        // else
        // return false;
    }
}