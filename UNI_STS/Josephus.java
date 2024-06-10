//Josephus trap

package UNI_STS;


import java.util.Scanner;
class Main { 
    static int josephus( int n, int k) {
        if(n==1) {
            return 1;
        }
        return((josephus((n-1), k)+ k - 1)% n + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Elements:");
        int n = sc.nextInt();
        System.out.print("Enter K value:");
        int k = sc.nextInt();
        System.out.print("Josephus Number is:");
        System.out.println(josephus(n,k));
    }
}
