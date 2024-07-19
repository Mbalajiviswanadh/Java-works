import java.util.*;
class ReverseWordinastring {

    public static String solve(String s){
        String[] str = s.trim().split("\\s+");

        StringBuilder res = new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            res.append(str[i]);
            if(i!=0)
            res.append(" ");
        }
        return res.toString();
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.print(solve(s));

    }
}
