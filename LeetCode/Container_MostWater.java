import java.util.*;
public class Container_MostWater {
    
    public static int findingTheMaxArea(int heights[],int n){
        int l_bar=0;
        int r_bar=n-1;
        int maxArea=0;

        while(l_bar<r_bar){
            // getting the min lenghts bars and finding the currecnt area
            int area = Math.min(heights[l_bar], heights[r_bar])*(r_bar-l_bar);
            // updating the maxArea on comparing the currecnt area and maxArea
            maxArea=Math.max(area, maxArea);

            if(heights[l_bar]<heights[r_bar])
            l_bar++;
            else r_bar--;
        }
        return maxArea;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n=sc.nextInt();

        int heights[]=new int[n];
        System.out.println("Enter the values inside:");
        for(int i=0;i<n;i++){
            heights[i]=sc.nextInt();
        }

        // calling the function 
        System.out.println("The max area is :"+findingTheMaxArea(heights, n));
    }
}
