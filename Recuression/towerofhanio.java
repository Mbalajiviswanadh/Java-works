package Recuression;

import java.util.*;
class towerofhanio {
    
    public static void towerofhanio_transfer(int n, String source, String helper, String destination){


        //base case
        if(n==1){
            System.out.println("Disk " +n+" "+"Transfer from "+ source+ " "+"to "+ destination );
            return;
        }

        //recursion
        towerofhanio_transfer(n-1, source, destination, helper);  // here for the top n-1 disks without starting disk in this condition the "destinantion" will be "helper" and vice versa.
        System.out.println("Disk " +n+" "+"Transfer from "+ source+ " "+"to "+ destination );
        //this is last step 
        towerofhanio_transfer(n-1, helper, source, destination); //here, this is the last {3rd } step here the (n-1) disks are in "helper" bar so now to transfer to "destinantion" we use "source "  as helper
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Disks : ");
        int n = sc.nextInt();

        //calling function 
        towerofhanio_transfer(n, "\"SOURCE BAR\"", "\"HELPER BAR\"", "\"DESTINATION BAR\"");
    }
}
