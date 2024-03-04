// package General_Practice;
import java.util.Scanner;

public class Remove_value {

    public static int getresult(int arr[], int value){



        int i=0;
        for(int j=0;j<arr.length;j++){

            if(arr[j]!=value){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            
        }


        return i;
        

        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an Array :");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the values :");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the value to be removed: ");
        int value = sc.nextInt();

        //calling the function

        int newarraysize=getresult(arr, value);
        System.out.println("Array after removing :");

        for(int i=0;i<newarraysize;i++){
            System.out.println(arr[i]);
        }


    }
    
}
