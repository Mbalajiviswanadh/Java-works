import java.util.*;
class Containerwithmostwater {

    public static int solve(int[] h){
        int lb=0;
        int rb=h.length-1;
        int maxarea=0;

        while(lb<rb){
            int area= Math.min(h[lb],h[rb]) * (rb-lb);
            maxarea=Math.max(maxarea, area);
            if(h[lb] < h[rb])
            lb++;
            else
            rb--;
        }
        return maxarea;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();

        int h[]= new int[n];

        for(int i=0;i<n;i++){
            h[i]=sc.nextInt();
        }
        System.out.println(solve(h));
    }
}
