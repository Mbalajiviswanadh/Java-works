package TCS_TRANING.Previous_Questions;



import java.util.*;

class Main{
    
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        Map<Character, Integer> map= new HashMap<>();
        
        
        for(char c : str.toCharArray()){
            
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int maxc=0;
        char res=' ';
        for(char c : str.toCharArray()){
            int currc=map.get(c);
            
            if(maxc<currc){
                maxc=currc;
                res=c;
            }
        }
        System.out.print(res);
        
    }
}