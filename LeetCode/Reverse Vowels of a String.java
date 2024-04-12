import java.util.*;
class Reverse_VowelsofaString {


    public static String reverse(String s){


        int l=0;
        int r=s.length()-1;
        char[] words=s.toCharArray();
        String vowels="aeiouAEIOU";


        while(l<r){
            while(l<r && vowels.indexOf(words[l])==-1)
            l++;

            while(l<r && vowels.indexOf(words[r])==-1)
            r--;


            char temp=words[l];
            words[l]=words[r];
            words[r]=temp;

            l++;
            r--;
        }
        String ans = new String(words);
        return ans;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();

        System.out.println("Result : "+reverse(s));
        sc.close();
    }
    
}
