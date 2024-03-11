import java.util.*;

class CUstom_Sort_String{

    public static String customSortString(String order, String s){
        StringBuilder res = new StringBuilder();

        int count[]=new int[26];

        for(char c : order.toCharArray())
        count[c-'a']++;

        for(char ch:s.toCharArray()){
            if(count[ch-'a']==0)
            res.append(ch);
            else
            count[ch-'a']++;
        }


        for(char c: order.toCharArray()){
            while (count[c-'a']>1) {
                res.append(c);
                count[c-'a']--;
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the input for 1st (order) Sting :");
        String order = sc.nextLine();
        System.out.println("ENter the input for 2st (str to compar) Sting :");
        String s = sc.nextLine();

        // calling the fucntion 

        String result=customSortString(order, s);
        System.out.println("Custom Sorted Result : "+result);
    }
}