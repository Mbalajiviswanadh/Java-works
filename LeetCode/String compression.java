class Solution {
    public String compressedString(String word) {
        int count=1;

        StringBuilder res = new StringBuilder();

        for(int i=1;i<word.length();i++){
            char c =word.charAt(i);
            char prevc=word.charAt(i-1);

            if(i<word.length() && c==prevc && count<9){
                count++;
            }
            else{
                
                res.append(count).append(prevc);
                count=1;
            }
        }
        res.append(count).append(word.charAt(word.length()-1));
        return res.toString();
    }
}