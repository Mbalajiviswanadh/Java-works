import java.util.*;

class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine ){

        Map<Character,Integer> map = new HashMap<>();

        for(char c : ransomNote.toCharArray()){
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        int size=map.size();
        for(char c : magazine.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    map.remove(c);
                    size--;
                }
                if(size==0)
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String for ransomNote :");
        String ransomNote=sc.nextLine();

        System.out.println("Enter the String for magazine :");
        String magazine=sc.nextLine();
        sc.close();
        // calling the function
        System.out.println("Result : " +canConstruct(ransomNote, magazine));
    }
}
