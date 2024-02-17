import java.util.*;

class Largest_SubSring {

    public static int finding_lasrgest_substring_length(String s, int n){

        int starting_point=0;
        int ending_point=0;
        int maxsum=0;

        HashSet<Character> hash_set= new HashSet<>();

        while(ending_point < n){
            if(!hash_set.contains(s.charAt(ending_point))){
                hash_set.add(s.charAt(ending_point));
                ending_point++;

                maxsum= Math.max(hash_set.size(),maxsum);
            }
            else{
                hash_set.remove(s.charAt(starting_point));
                starting_point++;
            }
        }
        return maxsum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String s= sc.nextLine();
        int n =s.length();

        System.out.println("Size of the Largest SubString is : " +finding_lasrgest_substring_length(s, n));


    }
    
}
