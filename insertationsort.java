import java.util.Scanner;

class InsertationSort {

    public static void placingInsertationsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for arraylength :");
        int arraylength = sc.nextInt();
        int arr[] = new int[arraylength];
        
        //input array numbers
        System.out.println("Enter the values:");

        for(int i = 0; i<arraylength;i++){
            arr[i] =sc.nextInt();

        }

        //insertation Sort
        for(int i =1; i<arraylength;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1] =arr[j];  //this is for shifting
                j--; 
            }
            //placing
            arr[j+1] =current;
        }

        placingInsertationsort(arr);

    }
}