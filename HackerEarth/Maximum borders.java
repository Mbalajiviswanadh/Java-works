package HackerEarth;

import java.util.*;

class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t=sc.nextInt();
        sc.nextLine();
        
        for(int te=0;te<t;te++){
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        int maxcount=0;

            for(int i=0;i<n;i++){
                int currcount=0;
                String instr=sc.nextLine();

                for(int j=0;j<instr.length();j++){

                    if(instr.charAt(j)=='#')
                    currcount++;
                }

                maxcount=Math.max(maxcount,currcount);
            }
        System.out.println(maxcount);
        }
        
    }
}