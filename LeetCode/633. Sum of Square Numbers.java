import java.util.*;

class SumofSquareNumbers {

    public static boolean findingthevalue(int c){
        // two points 
        long l = 0;
        long r=(long) Math.sqrt(c);

        while(l<=r){
            long val=l*l+r*r;
            if(val==c)
            return true;
            else if(val<c)
            l++;
            else
            r--;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to find:");
        int c = sc.nextInt();

        // calling the function 
        System.out.println("Result : "+ findingthevalue(c));
    }
}
