import java.util.*;

class Candy{

    public static int numOfCandies(int rating[]){

         // L to R -> r[i]> r[i-1] => c[i]=c[i-1]+1
        // R to L -> r[i]> r[i+1] => c[i]=max(c[i],c[i+1]+1);

        int candies[]= new int[rating.length];

        candies[0]=1;

        for(int i=1;i<rating.length;i++){

            if(rating[i]> rating[i-1])
            candies[i]=candies[i-1]+1;
            else
            candies[i]=1;
        }

        for(int i=rating.length-2;i>=0;i--){

            if(rating[i]> rating[i+1])
            candies[i]=Math.max(candies[i], candies[i+1]+1);
        }

        int sum=0;

        for(int i: candies){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int rating[]= new int[n];

        for(int i=0;i<n;i++){
            rating[i]=sc.nextInt();
        }

        System.err.println(numOfCandies(rating));
    }
}