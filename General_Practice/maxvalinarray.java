// package General_Practice;
import java.util.*;
class maxval_in_an_array {


    public static void finding_maxvalue(int arr[]){


        System.out.println("Taken Array:");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int maxvalue=arr[0];

        for(int i =0;i<arr.length;i++){

                if(arr[i]>maxvalue){
                    maxvalue=arr[i];
                }

        }
        System.out.println("MaxValue in the above Array is : "+maxvalue);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the values :");

        for(int i =0; i<n;i++){
            arr[i] =sc.nextInt();
        }

        finding_maxvalue(arr);

    }
    
}
