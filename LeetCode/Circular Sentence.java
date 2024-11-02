class Solution {
    public boolean isCircularSentence(String s) {
        String strarr[]= s.split(" ");


        for(int i=0;i<strarr.length-1;i++){
            char end = strarr[i].charAt(strarr[i].length()-1);

            char nextstart=strarr[i+1].charAt(0);

            if(end!=nextstart)
            return false;
        }

        char lastend= strarr[strarr.length-1].charAt(strarr[strarr.length-1].length()-1);
        char first= strarr[0].charAt(0);

        return lastend==first;

        // Set<Character> set = new HashSet<>();

        // for(String val:strarr){
        //     char first=val.charAt(0);

        //     set.add(first);
        // }

        // for(String val : strarr){
        //     char end =val.charAt(val.length()-1);

        //     if(set.contains(end))
        //     set.remove(end);
        // }

        // if(set.size()==0)
        // return true;
        // else
        // return false;

     
    }
}