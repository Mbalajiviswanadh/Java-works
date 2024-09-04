package HackerEarth;

import java.util.*;

class Main{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int t= sc.nextInt();
        sc.nextLine();

        while(t>0){
            t--;
            int n=sc.nextInt();

            int a[]= new int[n];
            int b[]=new int[n];

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }


            int l=0;
            int r=n-1;

            while(l<n && a[l]==b[l])
            l++;

            while(r>0 && a[r]==b[r])
            r--;
        

            if(l>r)
            System.out.println(0);
            else
            System.out.println(r-l+1);

        }
    }
}