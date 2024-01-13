import java.util.Scanner;

public class patterns {


    static void rectangel(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void rstar(int n){
        
         for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void nuberpattern(int n){

            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
    }
    static void repeatedpattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void inversestar(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void numberinverse(int n){
        for(int i=1; i<=n;i++){
            for(int j=1 ; j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    static void middle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void inversemiddle(int n){
        for(int i=0;i<n;i++){
            for(int j=0; j<i;j++){
                System.out.print(" ");
            }

            for(int j=0;j<2*n-(2*i+1) ;j++){
                System.out.print("*");
            }

            for(int j=0; j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void doublemiddle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
                for(int i=0;i<n;i++){
            for(int j=0; j<i;j++){
                System.out.print(" ");
            }

            for(int j=0;j<2*n-(2*i+1) ;j++){
                System.out.print("*");
            }

            for(int j=0; j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
 
    static void rightleft(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
 


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        rstar(n);
        System.out.println("---\n");
        rectangel(n);
        System.out.println("---\n");
        nuberpattern(n);
        System.out.println("---\n");
        repeatedpattern(n);
        System.out.println("---\n");
        inversestar(n);
        System.out.println("---\n");
        numberinverse(n);
        System.out.println("---\n");
        middle(n);
        System.out.println("---\n");
        inversemiddle(n);
        System.out.println("---\n");
        doublemiddle(n);
        System.out.println("---\n");
        rightleft(n);



    }
}
