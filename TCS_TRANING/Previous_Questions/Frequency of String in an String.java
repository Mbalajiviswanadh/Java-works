package TCS_TRANING.Previous_Questions;
import java.util.*;

class main{
    
    public static String changecaps(String s){
        
        if(s==null || s.isEmpty())
        return s;
        
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        String str =sc.nextLine();
        
        String strarr[]= str.split("\\s+");
        Map<String, Integer> map= new HashMap<>();
        
        
        for(String s:strarr){
            String w=changecaps(s);
            map.put(w, map.getOrDefault(w,0)+1);
        }
        
        for(String i: map.keySet()){
            System.out.print(i+" "+map.get(i)+" ");
        }
        
        
    }
}