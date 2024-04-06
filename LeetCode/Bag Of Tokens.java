import java.util.*;

class Bag_ofTokens{

    public static int findingScore(int tokens[],int n, int power){
        Arrays.sort(tokens);

        int score=0;
        int i=0;
        int j=n-1;

        while(j>=i){
            if(tokens[i]<=power){
                power-=tokens[i];
                i++;
                score++;
            }
            else if(score>0 && i<j){
                power+=tokens[j];
                j--;
                score--;
            }
            else 
            break;
        }
        return score;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();

        int tokens[]=new int[n];
        System.out.println("Enter the values inside :");
        for(int i=0;i<n;i++){
            tokens[i]=sc.nextInt();
        }
        System.out.println("Enter the Power values :");
        int power=sc.nextInt();

        System.out.println("Result : "+findingScore(tokens, n, power));
        sc.close();
    }
}