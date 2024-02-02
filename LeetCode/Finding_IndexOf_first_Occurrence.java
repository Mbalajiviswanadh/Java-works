import java.util.*;

class Finding_IndexOf_first_Occurrence {

    public static int find_occurrance(String str1, String str2){

        int str1_size=str1.length();
        int str2_size=str2.length();

        //base cases

        if(str1_size<str2_size){
            return -1;
        }

        //1) itration up to the str1-str2
        for(int i=0;i<=str1_size-str2_size;i++){
            
            //2) finding the first char of str2 in str1 
            int j=0;
            while(j<str2_size && str1.charAt(i+j) == str2.charAt(j)){
                j++;
            }
            if(j==str2_size){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String :");

        String str1= sc.nextLine();

        System.out.println("Enter the second String to comapre the 1st String");

        String str2=sc.nextLine();

        //calling the function 
        int result = find_occurrance(str1, str2);
        System.out.print("The Index is :" +result);
        


    }
    
}
