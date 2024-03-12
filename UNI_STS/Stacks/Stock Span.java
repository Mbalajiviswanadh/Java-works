package UNI_STS.Stacks;
import java.util.*;

class Stock_span{

    public static void findtheSPan(int prices[],int n){

        Stack<Integer> st=new Stack<>();
        int SPan[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && prices[i]>prices[st.peek()]){
                st.pop();
                
            }
            SPan[i]=st.isEmpty() ? i+1 :i-st.peek();
                st.push(i);
        }

        for(int i=0;i<n;i++){
            System.out.print(SPan[i]+" ");
        }
        System.out.println();
        

    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n =sc.nextInt();

        System.out.println("Enter the values inisde:");
        int prices[]=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }

       findtheSPan(prices, n);

    }
}