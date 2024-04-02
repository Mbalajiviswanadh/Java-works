class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> s_m=new HashMap<>();
        Map<Character,Character> t_m=new HashMap<>();


        for(int i=0;i<s.length();i++){
            char char_s=s.charAt(i);
            char char_t=t.charAt(i);


            if(s_m.containsKey(char_s)){
                if(s_m.get(char_s)!=char_t)
                return false;
            }
                else if(t_m.containsKey(char_t))
                return false;


                s_m.put(char_s,char_t);
                t_m.put(char_t,char_s);
        }
        return true;
    }
}