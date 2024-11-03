class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() !=goal.length())
        return false;
        String res;
        for(int i=0;i<s.length();i++){

            res=s.substring(i)+s.substring(0,i);

            if(res.equals(goal))
            return true;
        }
        return false;
        
    }
}