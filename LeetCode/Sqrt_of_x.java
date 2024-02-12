import java.util.*;

class Square_root_of_x{

    public static int findingroot(int x){

        //base case
        if(x==0 || x==1){
            return x;
        }

        int start=1;
        int end=x;
        int mid=-1;

        while(start <=end){

            mid= start +(end-start)/2;

            if((long)mid*mid >(long) x){
                end= mid-1;
            }
            else if(mid*mid ==x){
                return mid;
            }
            else{
                start = mid+1;
            }
        }
        return Math.round(end);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number :");

        int x= sc.nextInt();

        int result = findingroot(x);
        System.out.println("The Sqrt of "+x+" is :" +result);
    }
}