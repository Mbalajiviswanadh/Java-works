import java.util.*;
class Printalltheduplicates {

    public static void solve(String str){
        char[] ch = str.toCharArray();

        Map<Character,Integer> map = new HashMap<>();
        for(char c: ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
     

        for(Map.Entry<Character,Integer> i : map.entrySet()){
            if(i.getValue()>1){
                System.out.println(i.getKey()+", count = "+i.getValue());
            }
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String str = sc.nextLine();
        solve(str);
    }
}
