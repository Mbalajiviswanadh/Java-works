class Solution {
    public boolean canChange(String start, String target) {
        // checking the indexs

        if(start.equals(target))
        return true;

        int i=0;
        int j=0;

        int n = start.length();
        
        while(i<n && j<n){

            // skiping if the char = '_'
            while(i<n && start.charAt(i)=='_'){
            i++;

            }

            // skiping if the char = '_'
            while(j<n && target.charAt(j)=='_'){

            j++;
            }


            if(i<n && j<n){

                if(start.charAt(i)!=target.charAt(j))
                return false;


                if(start.charAt(i)=='L' && i<j)
                return false;


                if(start.charAt(i)=='R' && i>j)
                return false;

                i++;
                j++;
            }

        }
        // skiping if the char = '_'
        while(i<n && start.charAt(i)=='_'){
            i++;        

        }

        while(j<n && target.charAt(j)=='_'){
        j++;

        }


        return i==n && j==n;

    }
}