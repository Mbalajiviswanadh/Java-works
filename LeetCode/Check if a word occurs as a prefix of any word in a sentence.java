class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        // spliting using sigle space  " "
        // ["i", "love", "eating", "burger"]
        // check each s whether the  searchWord is present in s and it should be in index==0 and index!= -1
         


        String str[]=sentence.split(" ");

        for(int i=0;i<str.length;i++){

            String s = str[i];

            if(s.indexOf(searchWord) !=-1 && s.indexOf(searchWord)== 0)
            return i+1;
        }
        return -1;
    }
}