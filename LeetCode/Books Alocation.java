import java.util.ArrayList;
class Solution {

    public static boolean isValid(ArrayList<Integer> arr, int n, int m , int mid){

        int student=1;
        int pagesNeed=mid;

        int pages=0;

        for(int i=0;i<n;i++){

            int val=arr.get(i);
            // NOTE EDGE CASE
            if(val>pagesNeed)
            return false;

            if(pages+val<=pagesNeed){
                pages+=val;
            }
            else{
                student++;
                pages=val;
            }
        }

        return student<=m;

    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {

        // FINDING THE RANGE 0 TO SUM(ARR)
        // APPLYING BINARY SEARCH
        // IF MID IS VALID - MOVES LEFT
        // IF MID IS NOT-VALID - MOVES RIGHT

        // IDENTIFYING VALID OR NOT-VALID
        // HERE MID IS MAX-NEED PAGES
        // WE HAVE TO CHECK WHETHER THE PAGES ASSIGNED TO A STUDENT IS <= MID
        // IF ITS MORE THEN THE MID ADD NEW STUDENT 
        // AT THE END CHECK IF GIVEN STUDENTS== TO THE STUDENTS WE GOT DUING THIS VARIFICATION
        // IF LESS/EQUAL RETURN TRUE, ELSE FALSE


        if(m>n)
        return -1;

        int range=0;
        for(int i: arr){
            range+=i;
        }

        int l=0;
        int r=range;
        int res=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            
            if(isValid(arr,n, m, mid)){ //MOVES LEFT
                res=mid;
                r=mid-1;
            }
            else{ //MOVES RIGHT
                l=mid+1;
            }
        }
        
        return res;
    }

}