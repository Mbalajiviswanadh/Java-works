package UniSts;

import java.util.*;

class Majority_Element {

    public static int finding_majority(int arr[] , int n){

        // in the begging we are taking 1st index=0 as the majority values
        int majorirty_value =arr[0];
        int count =0;

        for(int i=1;i<n;i++){

            //if the count is 0 then we are taking the i value in majotiyt values
            if( count ==0){
                count++;
                majorirty_value =arr[i];
            }
            //  here we are comparing the majority value with the next i values 
            else if(majorirty_value == arr[i]){
                // if the majorirty value is equal to next i values , we need to increment the count value
                count++;
            }
            // if not equle we need to decrement the count value 
            else{
                count--;
            }
        }
        return majorirty_value;

        /*
            * class Solution {
        public int majorityElement(int[] nums) {
            int n = nums.length;
            int count = 1; // Start count from 1 for the first element
            int majority_value = nums[0];

            for(int i = 1; i < n; i++) {
                if(nums[i] == majority_value) {
                    count++;
                } else {
                    count--;
                    if(count == 0) {
                        // If count becomes 0, update majority_value to the current element
                        majority_value = nums[i];
                        count = 1; // Reset count for the new majority candidate
                    }
                }
            }
            return majority_value;
        }
    }

         */
    }
    

    public static void main ( String [] args ){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of an array :");

        int n =sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the values :");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = finding_majority(arr, n);
        System.out.print("The majority value in an array is :" +result);


    }
}
