import java.util.*;

class PrintAnagram{
    
    public static void solve(String[] words){
        
        Map<String, List<String> > map = new HashMap<>();
        
        
        for(String str : words){
            char ch[]= str.toCharArray();
            String sortString = new String(ch);
            
            if(!map.containsKey(sortString))
            map.put(sortString, new ArrayList<>());
            
            map.get(sortString).add(str);
        }
        
        for(Map.Entry<String, List<String>> i :map.entrySet()){
            System.out.println(i.getKey() + " "+ i.getValue());
        }
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        
        String[] words = new String[n];
        sc.nextLine();
        
        for(int i=0;i<n;i++){
            words[i]=sc.nextLine();
        }
        
        solve(words);
        
        
        
    }
}