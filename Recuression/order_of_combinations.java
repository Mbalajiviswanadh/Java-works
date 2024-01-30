
/*
    21BCE8520 - Balaji viswanadh
    STS-E2
    ASSIGNMENT-1
    ORDER OF COMBINANTIONS _USING RECURESION.
*/ 

//this order_of_combinations.java file is inside of Recuression folder
package Recuression;

import java.util.*;

class Order_of_Combinations{


    public static void printing_Combinations(int array[], int start, int result[], int index){

        //base case

        if(index == result.length){
            for(int num:result){
                System.out.print(num+" ");
            }
            System.out.println();
            return;
        }



        for(int i=start;i<array.length;i++){
            result[index]=array[i];
            printing_Combinations(array, i+1, result, index+1);
        }
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of the Array:");

        int n = sc.nextInt();

        int array[] = new int[n];

        // System.out.println("Enter the Values :");
        for(int i =0;i<n;i++){
            array[i]=i+1;
        }

        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();

        int result[] =new int[r];


        //calling the function 
        printing_Combinations(array, 0, result, 0);
        

    }

}