class Solution {

    public boolean solve(int n, int x){

        if(Math.pow(3,x)==n)
        return true;
        else if(Math.pow(3,x)>n)
        return false;

        return solve(n,x+1);
    }
    public boolean isPowerOfThree(int n) {
        if(n==-1 && n==0)
        return false;

        return solve(n,0);
    }
}