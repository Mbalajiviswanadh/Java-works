import java.util.*;

class Trapped_rainWater{

    public static int trappedWater(int heights[],int n){


        int trapWater=0;
        if(n<=2)
        return trapWater;


        int leftMax[]=new int[n];
        int rightMax[]=new int[n];

        leftMax[0]=heights[0];
        for(int i=1;i<n;i++)
        leftMax[i]=Math.max(leftMax[i-1], heights[i]);
        rightMax[n-1]=heights[n-1];
        for(int i=n-2;i>=0;i--)
        rightMax[i]=Math.max(rightMax[i+1], heights[i]);


        for(int i=0;i<n;i++)
        trapWater+=Math.max(0, Math.min(leftMax[i], rightMax[i])-heights[i]);

        return trapWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n =sc.nextInt();
        int heights[]=new int[n];
        System.out.println("Enter the values inside :");
        for(int i=0;i<n;i++){
            heights[i]=sc.nextInt();
        }

        System.out.println("Result : "+trappedWater(heights, n));


        sc.close();
    }
}