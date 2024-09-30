package TCS_TRANING;

// import java.util.*;

// class palindrom{
    
    
//     public static void main(String[] args){
//         // String str = "()))((";
//         // String str = "()))()";
//         String str ="(())()";
        
//         Stack<Character> stack = new Stack<>();
        
        
//         for(char c : str.toCharArray()){
            
//             if(c==')'){

//                 if(!stack.isEmpty() && stack.peek()=='(')
//                 stack.pop();
//                 else
//                 stack.push(c);
//             }
//             else
//             stack.push(c);
//         }
        
//         int res = stack.size()/2;
        
//         System.out.print(res);
//     }
// }




import java.util.*;


class palin{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str ="()))((";
        // String str = "()))()";
        // String str = "(())()";
        String str =sc.nextLine();

        int min_sum=0;
        int sum=0;
        for(char c : str.toCharArray()){
            if(c=='(')
            sum+=1;
            else
            sum-=1;

            min_sum=Math.min(min_sum,sum);
        }
        System.out.println(-min_sum);
    }
}