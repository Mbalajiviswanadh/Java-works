package TCS_TRANING.Previous_Questions;


import java.util.*;

class Main{
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.nextLine();
        
        String str2 = sc.nextLine();
        
        if(str1.length() != str2.length()){

            System.out.print(false);
            return;
        }
        
        Map<Character, Integer> map = new HashMap<>();
        
        
        for(char c : str2.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        for(char c : str1.toCharArray()){
            
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                
                
                
                if(map.get(c)==0){
                    map.remove(c);
                }
                
            }
            else{
                System.err.println(false);
                return;
            }
        }
        
        if(map.size()==0)
        System.out.print(true);
        else
        System.out.print(false);
        
    }
}
