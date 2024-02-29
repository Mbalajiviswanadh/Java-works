import java.util.*;
class Permutations_in_String {

    public static boolean isPresnetInS2_orNot(String s1, String s2){

        // creating an array for mapping all the alphabets chars
        int map_array[]=new int[26];

        for(int c: s1.toCharArray()){
            map_array[c-'a']++;
        }
        int count= s2.length();
        int i=0,j=0;
        
        while(j<s2.length()){
            
            // checking whether the index value in s2 is lessthan '0' and also decrementing and also if the condtion is true we are reducing the count 
            if(map_array[s1.charAt(j++)-'a']-- >0){
                count--;
            }

            if(count==0) return true;
            // if the char is missing while sliding the window; we are increaing the count again
            if(j-1==s1.length() && map_array[s1.charAt(i++)-'a']++ >=0)
            count++;
        }
        return false;


    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String value for S1 (String 1) :");
        String s1 = sc.nextLine();

        System.out.println("Enter the String value for S2 (String 2) :");
        String s2 = sc.nextLine();

        
    }
}
