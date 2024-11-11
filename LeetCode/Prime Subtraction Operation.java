class Solution {

    public boolean isPrime(int n){
        if(n<=1)
        return false;


        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    // public List<Integer> getPrimeValues(){
    //     List<Integer> list = new ArrayList<>();

    //     for(int i=2;i<1000;i++){
    //         if(isPrime(i))
    //         list.add(i);
    //     }
    //     return list;
    // }
    // public int primeLessThenValue(int n, List<Integer> list){
        

    //     for(int i=list.size()-1;i>=0;i--){

    //         if(list.get(i)<n)
    //         return list.get(i);
    //     }
    //     return 0;
    // }

    public boolean primeSubOperation(int[] nums) {
        // finding prime num strictly less then the nums[i]
        // subtrating it from the nums[i]
        // and checking the final array whether it is in sorted order or not 
        for (int i = 0; i < nums.length; i++) {
            int bound = (i == 0) ? nums[i] : nums[i] - nums[i - 1];
            
            if (bound <= 0) return false;
            
            int largestPrime = 0;
            for (int j = bound - 1; j >= 2; j--) {
                if (isPrime(j)) {
                    largestPrime = j;
                    break;
                }
            }
            
            nums[i] -= largestPrime;
        }
        return true;



    }
}