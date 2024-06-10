package UNI_STS;

import java.util.Scanner;
class Main {
    static void combination(int arr[], int size, int r, int index, int data[], int i){
        if(index==r) {
            for(int j=0; j<r; j++) {
                System.out.print(data[j] +" ");
            }
            return;
        }
        if(i>=size){ 
            return;
        }
        data[index]= arr[i];
        combination(arr,size,r,index+1,data,i+1);
        combination(arr,size,r,index,data,i+1);
    }
    void printcomb(int a[], int size,int r){
        int data[] = new int[r];
        combination(a,size,r,0,data,0);
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Elements:");
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i< size; i++) {
            System.out.print("Enter the Element:");
            a[i] = sc.nextInt();
        };
        System.out.print("Enter the Size of Combination:");
        int r = sc.nextInt();
        m.printcomb(a,size,r);
    }
}
