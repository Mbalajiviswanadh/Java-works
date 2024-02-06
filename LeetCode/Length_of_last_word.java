import java.util.*;
class Length_of_lastword {
    public static int lengthOfLastWord(String s) {

        if(s.length() ==1){
            return 1;
        }

        int len=0;

        //removing the spaces

        String str=s.trim();
        for(int i =0; i<str.length(); i++){

            char c = str.charAt(i);

            if(c ==' '){
                
                len=0;
            }
            else{
                len++;
            }
        }
        return len;
        
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input String :");

        String s= sc.nextLine();

        //caling the function 

        int result = lengthOfLastWord(s);
        System.out.println("The Length is : " +result);
        
    }
}