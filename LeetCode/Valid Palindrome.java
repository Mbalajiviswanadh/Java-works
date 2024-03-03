import java.util.*;
class Valid_Palindrome {
    public static boolean isPalindrome(String s){
        if(s.isEmpty()){
            return true;
        }
        int l=0;
        int r=s.length()-1;

        while(r>=l){
            char curr_first=s.charAt(l);
            char curr_last=s.charAt(r);
            if(!Character.isLetterOrDigit(curr_first)){
                l++;
            }
            else if(!Character.isLetterOrDigit(curr_last)){
                r--;
            }
            if(Character.isLowerCase(curr_first)!=Character.isLowerCase(curr_last)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String input:");
        String s =sc.nextLine();


    }    
}
