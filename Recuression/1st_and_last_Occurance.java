package Recuression;
import java.util.*;

 class First_and_Last_Occurance {

    public static int  first =-1;
    public static int  last=-1;

    //fucntion for finding occurance
    public static void Finding_Occurance(String str, int index, char element_tofind){

        //base case

        if(index==str.length()){
            System.out.print("Starting place :"+first+"\n");
            System.out.print("Last place :"+last);
            return;
        }



        //getting the charater from the string 
        char current_charater = str.charAt(index);

        if(current_charater == element_tofind ){

            if(first==-1){
                first =index;
            }
            else{
                last= index;
            }
        }
        //recuression
        Finding_Occurance(str,index+1,element_tofind);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Type letters: ");

        String str= sc.nextLine();

        System.out.print("Enter One Character to find 1st and Last place{indices} :");


        //only for single char
        String charInput=sc.next();

        // char element_tofind = sc.charAt;
        char element_tofind = charInput.charAt(0);


        //calling function
        Finding_Occurance(str, 0, element_tofind);


    }
}
