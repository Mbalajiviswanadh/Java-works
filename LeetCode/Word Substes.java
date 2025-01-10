class Solution {

    public int[] countChar(String word){

        int counts[]= new int[26];

        for(char c:word.toCharArray() ){
            counts[c-'a']++;
        }
        return counts;
    }

    public boolean check(int[] counts, int[] maxcount){

        for(int i=0;i<26;i++){

            if(counts[i]<maxcount[i])
            return false;
        }
        return true;
    }
    public List<String> wordSubsets(String[] words1, String[] words2) {
        

        int maxcount[]= new int[26];

        for(String s: words2){

            int counts[]= countChar(s);

            for(int i=0;i<26;i++){
                maxcount[i]=Math.max(maxcount[i], counts[i]);
            }
        }


        List<String> res =  new ArrayList<>();
        
        for(String w: words1){

            int counts[]= countChar(w);
                if(check(counts, maxcount))
                res.add(w);
        
        }

        return res;

    }
}