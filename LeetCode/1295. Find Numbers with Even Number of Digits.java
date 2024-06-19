
import java.util.*;
class FindNumberswithEvenNumberofDigits {

    public static int findNumbers(int[] numbers){

        int digit_count=0;
        for(int num: numbers){

            if(isEven(num))
            digit_count++;
            
        }
        return digit_count;

    }

     static boolean isEven(int num){
        int numOfDIgits=digitsCOunt(num);

        return numOfDIgits % 2 ==0;

    }

     static int digitsCOunt(int num){

        int count=0;

        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENter the size of an numbers array :");
        int n=sc.nextInt();

        int[] numbers = new int[n];

        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }

        // calling the fucntion 
        // FindNumberswithEvenNumberofDigits obj= new FindNumberswithEvenNumberofDigits();


        System.out.println("Result : "+  findNumbers(numbers) );

    }
}
