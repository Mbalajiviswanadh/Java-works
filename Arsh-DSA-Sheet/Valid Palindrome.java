import java.util.*;
class ValidPalindrome {

    public static boolean ispalindrom(String s,int l,int r){

        while(l<r){
            if(s.charAt(l) != s.charAt(r))
            return false;

            l++;
            r--;
        }
        return true;
    }
    public static boolean solve(String s) {
        int l=0;
        int r=s.length()-1;

        while(l<r){
            if(s.charAt(l) != s.charAt(r))
            return ispalindrom(s,l+1,r) || ispalindrom(s,l,r-1);

            l++;
            r--;
        }
        return true;




        // int count=0;
        // StringBuilder str = new StringBuilder(s);
        // String rev= str.reverse().toString();
        // boolean revboolean= s.equals(rev);

        // if(s.length()%2!=0 && s.charAt(l)!=s.charAt(r))
        // return false;
        
        // if(revboolean)
        // return s.equals(rev);
        // while(l<r){
        //     if(s.charAt(l)==s.charAt(r)){
        //         l++;
            
        //         r--;
        //     }
        //     if(s.charAt(l)!=s.charAt(r)){
        //         count++;
        //         l++;
        //         r--;
        //     }
        // }
        // if(count<=1)
        // return true;
        // else
        // return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();

        System.out.println();

        System.out.println(solve(s));
    }
}