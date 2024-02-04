package Recuression;

import java.util.*;

class Binary_Search_usingRecursion {

    public static int Searching(int a[] ,int key, int n,int l, int h){

        // int l =0;
        // int h = n-1;
        //if the array is containg only one element
        if(l <= h){
        
            

                int mid= l+(h-l)/2;

                if(a[mid] ==key){
                    return mid;
                }
                else if(a[mid] > key){
                    return Searching(a,key,n,l,mid-1);
                }
                else{
                    return Searching(a, key, n, mid+1, h);
                }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");

        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the values inside the arry : ");

        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the key value to find :");
        int key = sc.nextInt();

        //calling the function 
        int l=0;
        int h=n-1;
        int result = Searching(a, key, n, l,h);

        System.out.print("The Key is at : " + result);


    }
    
}
