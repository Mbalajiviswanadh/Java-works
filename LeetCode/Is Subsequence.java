import java.util.*;


class Is_Subsequence{

    public static boolean compare(String s, String t){
        int sPoint=0;
        int tPoint=0;

        while(sPoint<s.length() && tPoint<t.length()){
            if(s.charAt(sPoint)==t.charAt(tPoint))
            sPoint++;

            tPoint++;
        }
        return sPoint==s.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the 1st String :");
        String s=sc.nextLine();

        System.out.println("Enter the 2nd String :");
        String t=sc.nextLine();

        System.out.println("Result : "+compare(s, t) );
        sc.close();

    }
}