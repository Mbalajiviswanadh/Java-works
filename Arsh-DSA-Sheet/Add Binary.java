import java.util.*;

class AddB_inary{


    public static String solve(String a, String b ){

        int i=a.length()-1;
        int j=b.length()-1;

        int carry=0;

        StringBuilder res = new StringBuilder();

        while(i>=0 || j>=0 || carry==1){
            if(i>=0)
            carry+=a.charAt(i--)-'0';
            if(j>=0)
            carry+=b.charAt(j--)-'0';

            res.append(carry%2);
            carry/=2;

        }
        return res.reverse().toString();
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String a = sc.nextLine();
        String b =sc.nextLine();

        System.out.print(solve(a,b));

        sc.close();
    }
}