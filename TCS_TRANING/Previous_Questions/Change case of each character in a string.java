package TCS_TRANING.Previous_Questions;



import java.util.*;

class Main{


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String str = sc.nextLine();

        StringBuffer res = new StringBuffer();

        for(int i=0;i<str.length();i++){


            int aciinum=(int) str.charAt(i);

            if(aciinum >=65 & aciinum<=90)
            res.append((char) (aciinum+32));
            else if(aciinum>=97 && aciinum<=122)
            res.append((char) (aciinum-32));
            else if(str.charAt(i)==' ')
            res.append(" ");

        }

        System.out.println(res.toString());
    }
}