import java.util.*;

class Solution {

    public static void backtrackFun(String digits, int idx, StringBuilder combi, List<String> result,Map<Character,String> map ){

        if(idx==digits.length()){
            result.add(combi.toString());
            return;
        }

        // Getting the String from the map - using idx as a position
        String str = map.get(digits.charAt(idx));

        for(char c : str.toCharArray()){
            combi.append(c);
            backtrackFun(digits,idx+1, combi, result, map);
            // removing the last char when we reached idx==digits.length();
            combi.deleteCharAt(combi.length()-1);
        } 
    }
    public List<String> letterCombinations(String digits) {

        if(digits.length()==0)
        return new ArrayList<>();
        List<String> result = new ArrayList<>();

        Map<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");


        backtrackFun(digits,0,new StringBuilder(),result, map);
        return result;
        

    }
}