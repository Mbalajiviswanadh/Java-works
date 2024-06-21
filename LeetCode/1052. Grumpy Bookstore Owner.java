import java.util.*;
class GrumpyBookstoreOwner {
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int ans_sum=0;
        int unSatis=0;
        // sum of all satisfied customers
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0)
            ans_sum+=customers[i];
        }

        // this  is the sum of unsatis customers fom initial window (from 0 to minutes)
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1)
            unSatis += customers[i];
        }

        int max=unSatis;
        // now moving the window
        for(int i=minutes;i<customers.length;i++){
            if(grumpy[i-minutes]==1){

            unSatis -= customers[i-minutes];
            } 

            if(grumpy[i]==1){
                unSatis+=customers[i];
            }
            max=Math.max(max,unSatis);
        }
        return ans_sum + max;

        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size for cus && grumpy :");
        int n=sc.nextInt();
        int cus[]= new int[n];
        int grumpy[]= new int[n];
        System.out.println("ENter the values inside for cus :");
        for(int i=0;i<n;i++){
            cus[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            if(i%2==0){
                grumpy[i]=0;
            }
            else
            grumpy[i]=1;
            System.out.print(grumpy[i]+" ");
        }
        System.out.println();
        System.out.println("ENter the value for minutes :");
        int minutes = sc.nextInt();
        

        // callin the function
        System.out.println("Result : "+maxSatisfied(cus, grumpy, minutes));
    }
}
