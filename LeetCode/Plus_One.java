import java.util.*;

class Plus_one {
    public static int[] plusOne(int[] digits , int n) {

        int last_num = n-1;

        // [1, 2, 3]
        //        i  
        for(int i=n-1;i>=0;i--){
            
            if(digits[i] <9){
                digits[i]++;
                return digits;
            }
            digits[i] =0;

        }
        // creating new index {n+1}
        digits = new int[n+1];
        digits[0] =1;
        return digits;
    }

    void printingresult(int[] digits, int n){

        for(int i=0;i<n;i++){
            System.out.print(digits[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();

        int digits[] = new int[n];
        System.out.println("Enter the values :");

        for(int i =0; i<n;i++){
            digits[i]=sc.nextInt();
        }

        // int result[] =plusOne(digits,n);
        // System.out.println("Final Result is :" +result);
        plusOne(digits, n);
        Plus_one result =new Plus_one();
        System.out.print("Final result is :");
        result.printingresult(digits, n);

    }
}