
class Solution {
    public boolean canConstruct(String s, int k) {
        if(k> s.length())
        return false;

        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        int single=0;

        for(Integer freq : map.values()){
            if(freq%2==1)
            single++;
        }

        return single<=k;
    }
}