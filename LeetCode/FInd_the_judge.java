import java.util.*;

public class FInd_the_judge {
    
    public static int findTheJudge(int trust_array[][], int n) {
        int count[] = new int[n + 1];

        for (int t[] : trust_array) {
            count[t[0]]--;
            count[t[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people:");
        int n = sc.nextInt();

        System.out.println("Enter the number of trust relationships:");
        int m = sc.nextInt();

        int trust_array[][] = new int[m][2];

        System.out.println("Enter trust relationships (one pair per line):");
        for (int i = 0; i < m; i++) {
            trust_array[i][0] = sc.nextInt();
            trust_array[i][1] = sc.nextInt();
        }

        int result = findTheJudge(trust_array, n);
        System.out.println("The Town Judge is: " + result);
    }
}
