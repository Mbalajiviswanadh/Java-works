import java.util.*;
import java.util.zip.CheckedInputStream;;

class First_Palindromic_String {

    //heliping funtion to find palindrom

    public static boolean CheckPalindrom(String s){
        int i =0;
        int j=s.length()-1;

        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static String PrintthePalindrom(String strarr[]){

        for(String word : strarr){

            if(CheckPalindrom(word)){
                return word;
            }
        }
        return "";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        sc.nextLine();

        String strarr[] = new String[n];
        
        System.out.println("Enter the String values :");
        for(int i =0; i<n;i++){
            strarr[i] =sc.nextLine();
        }
        System.out.println();

        //calling the function
        String result= PrintthePalindrom(strarr);
        System.out.println("The FIrst Palidrom in the given array is: "+result);

    }
}
