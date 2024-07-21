import java.util.*;

class LongestCommonPrefix{

    public static String solve(String[] str){

        Arrays.sort(str);   

        String s1=str[0];
        String s2=str[str.length-1];

        int idx=0;
        while(idx < s1.length() && idx<s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx))
            idx++;
            else
            break;
        }
        String res =s1.substring(0, idx);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENter the size :");
        int n =sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];
        System.out.println("Enter the values :");
        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();
        }
        System.out.println();

        System.out.println(solve(str));
        sc.close();
    }
}