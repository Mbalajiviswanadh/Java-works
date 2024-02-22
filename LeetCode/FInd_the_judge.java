import java.util.*;
public class FInd_the_judge {
    
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
