import java.util.*;
class Valid_Palindrome {
    public static boolean isPalindrome(String s){
        if(s.isEmpty()){
            return true;
        }
        int i=0;
        int j=s.length()-1;

        while(j>=i){
            char curr_first=s.charAt(i);
            char curr_last=s.charAt(j);

            if(!Character.isLetterOrDigit(curr_first))
            i++;
            else if(!Character.isLetterOrDigit(curr_last))
            j--;
            else{
                if(Character.toLowerCase(curr_first)!=Character.toLowerCase(curr_last))
                return false;

                i++;
                j--;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String input:");
        String s =sc.nextLine();

        // calling the funtion 
        System.out.println("Result : "+isPalindrome(s));

    }    
}
