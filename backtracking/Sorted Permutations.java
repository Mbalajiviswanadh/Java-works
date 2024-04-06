package backtracking;

import java.util.*;

class Sorted_perm{

    public static void prinrPermu(String str, String perm, int idx, List<String>p){
        int n=str.length();
        if(n==0)
        p.add(perm);

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);

            String newString=str.substring(0, i)+str.substring(i+1);
            prinrPermu(newString, perm+ch, idx+1, p);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str=sc.nextLine();

        String perm="";

        List<String> p= new ArrayList<>();

        prinrPermu(str, perm, 0, p);
        Collections.sort(p);

        for(String permu:  p){
            System.out.println(permu);
        }


    }
}
