import java.util.*;

class Main{

    public static void main(String[] args) {
        String str = "araaci";
        int k  =2;
        // String str = "araaci";
        // int k  =1;
        // String str = "cbbebi";
        // int k  =3;

        Map<Character, Integer> map = new HashMap<>();

        int window_start=0;
        int maxsize=0;

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);

            map.put(c, map.getOrDefault(c, 0)+1);

            if(map.size() > k){

                char start_char= str.charAt(window_start);
                map.put(start_char, map.get(start_char)-1);
                
                if(map.get(start_char)==0)
                map.remove(start_char);

                window_start++;
            }

            if(map.size() <= k)
            maxsize= Math.max(maxsize, i-window_start+1);
        }
        
        System.out.println(maxsize);
    }
}