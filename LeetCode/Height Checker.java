import java.util.*;

class HeightChecker{

    public static int heightchecker(int[] heights, int n){
        int[] sortedheights= Arrays.copyOf(heights,heights.length);

        Arrays.sort(sortedheights);

        int count=0;
        for(int i=0;i<n;i++){
            if(heights[i]!=sortedheights[i])
            count++;
        }
        return count;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the heights array :");
        int n = sc.nextInt();

        System.out.println("Enter the valus inside :");
        int heights[]=new int[n];
        for(int i=0;i<n;i++){
            heights[i]=sc.nextInt();
        }

        sc.close();
        //call the function 
        System.out.println("Result :" +heightchecker(heights, n));
        

    }
}