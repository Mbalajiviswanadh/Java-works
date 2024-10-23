package SubString;
import java.util.*;

class Allsubstring{

    public static void usingSubstring_Fun(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        String str = "abc";


        for(int i=0;i<str.length();i++){

            String temp=" ";
            for(int j=i;j<str.length();j++){
                temp+=str.charAt(j);
                System.out.println(temp);
            }
        }
        System.out.println();

        System.out.println("using substring fun:");

        usingSubstring_Fun(str);
    }
}