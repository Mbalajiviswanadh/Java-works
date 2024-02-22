import java.util.*;
public class FInd_the_judge {
    
    public static int finding_theJudge(int trust_array[][],int n){

        // int n_value=trust_array[0][0];

        int count[] = new int[n+1];

        for(int t[] : trust_array){
            count[t[0]]--;
            count[t[1]]++;
        }

        for(int i=1;i<=n;i++){
            if(count[i]==n-1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sze of the array:");
        int n =sc.nextInt();

        int trust_array[][] = new int[n][n];

        System.out.println("Enter the values :");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                trust_array[i][j] =sc.nextInt();
            }
        }
    }
}
