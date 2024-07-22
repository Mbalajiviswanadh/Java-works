import java.util.*;
class Permutations_Two_arrays_satisiy_theCondition {
    public boolean isPossible(long a[], long b[], int n, long k) {
        // Your code goes here
        
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            // n-1-i (helps to get the elemment from the last)
            if(a[i]+b[n-1-i]<k)
            return false;
        }
        return true;
        
        /*
        Long[] aLong = new Long[n];
        for (int i = 0; i < n; i++) {
            aLong[i] = a[i];
        }

        // Sort aLong in reverse order
        Arrays.sort(aLong, Collections.reverseOrder());

        // Sort b in ascending order
        Arrays.sort(b);

        // Check if there exists a permutation where a[i] + b[i] >= k
        for (int i = 0; i < n; i++) {
            if (aLong[i] + b[i] < k) {
                return false;
            }
        }
        return true;
        */
    }
}