import java.util.*;
class SelectionSort{

    public static void Printingtheselectonsort(int arr[]){
        for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main (String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("take any number for array length:");
        int arraylength = sc.nextInt();


        int arr[] = new int[arraylength];

        //input array numbers
        System.out.println("Insert your numbers");
        for(int i = 0 ;i<arraylength;i++){
            arr[i]= sc.nextInt();
        }


        //selection sort

        for(int i = 0; i<arr.length;i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
                //sawp or replace 
                int temp = arr[smallest];
                arr[smallest]=arr[i];
                arr[i]= temp;
                
            }
        }
        Printingtheselectonsort(arr);
    }
}