class Solution {
    public int lengthOfLastWord(String s) {

        if(s.length() ==1){
            return 1;
        }

        int len=0;

        //removing the spaces

        String str=s.trim();
        for(int i =0; i<str.length(); i++){

            char c = str.charAt(i);

            if(c ==' '){
                
                len=0;
            }
            else{
                len++;
            }
        }
        return len;
        
    }
}