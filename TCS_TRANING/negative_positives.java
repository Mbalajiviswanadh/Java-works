package TCS_TRANING;

import java.util.*;

class Main{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();


        while(t-->0){

            int n=sc.nextInt();

            int nums[]= new int[n];

            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }

            // -1 -1 -1
            
            // -1 10 9 8 7 6

            int currsum=0;
            int sum=0;

            for(int i=n-1;i>=0;i=i-2){

                int x=nums[i];
                int y=nums[i-1];

                if(x<0 || y<0){
                    
                }

                currsum+=x+y;
            }
        }
    }
}