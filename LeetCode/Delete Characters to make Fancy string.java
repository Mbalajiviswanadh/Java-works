class Solution {
    public String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();

        res.append(s.charAt(0));
        int count=1;
        for(int i=1;i<s.length();i++){
            char c  =s.charAt(i);
            char lastOfres=res.charAt(res.length()-1);
            if(c==lastOfres){
                count++;
                if(count<3)
                res.append(c);
            }
            else{
                count=1;
                res.append(c);
            }
        }
        return res.toString();
    }
}