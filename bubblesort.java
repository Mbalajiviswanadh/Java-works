import java.util.*;
class BubbleSort{

    //Function to print the sorted array
    public static void printSortedArray(int arrSmallToBig[] ,int arrBigToSmall[]){
        
        for(int i =0;i<arrSmallToBig.length;i++){
            System.out.print(arrSmallToBig[i]+" ");
        }
        System.out.println();
        for(int i =0;i<arrBigToSmall.length;i++){
            System.out.print(arrBigToSmall[i]+" ");
        }

        System.out.println();
        
    }
    public static void main (String args[]){
        //input array
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the size of the array:");
        int imputarray = sc.nextInt();
        int arr[] = new int[imputarray];
        System.out.println("Insert the values:");

        for(int i=0;i<imputarray;i++){
            arr[i]=sc.nextInt();
        }

        int arrSmallToBig[] = Arrays.copyOf(arr, imputarray);
        int arrBigToSmall[] = Arrays.copyOf(arr, imputarray);


        //bubble sort
        for(int i=0;i<arrSmallToBig.length-1;i++){
            for(int j = 0; j<arrSmallToBig.length-i-1;j++){
                //small to big
                if(arrSmallToBig[j]>arrSmallToBig[j+1]){
                    //swap
                    int temp = arrSmallToBig[j];
                    arrSmallToBig[j]=arrSmallToBig[j+1];
                    arrSmallToBig[j+1]=temp;
                }

            }
        }
        for(int i=0;i<arrBigToSmall.length-1;i++){
            for(int j = 0; j<arrBigToSmall.length-i-1;j++){
                //big to small
                if(arrBigToSmall[j]<arrBigToSmall[j+1]){
                    //swap
                    int temp = arr[j];
                    arrBigToSmall[j]=arrBigToSmall[j+1];
                    arrBigToSmall[j+1]=temp;
                }

            }
        }
        System.out.println("Sorted array:");
        printSortedArray(arrSmallToBig,arrBigToSmall);
        


    }
}