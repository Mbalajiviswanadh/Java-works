import java.util.*;

class Main{
    
    public static int solve(String str){
        Stack<Integer> stack = new Stack<>();
        
        for(char c:str.toCharArray()){
            
            if(Character.isDigit(c)){
                stack.push(c-'0');
            }
            else{
                int top=stack.pop();
                int sec=stack.pop();
                
                if(c=='+')
                stack.push(sec+top);
                else if(c=='-')
                stack.push(sec-top);
                else if(c=='*')
                stack.push(sec*top);
                else if(c=='/')
                stack.push(sec/top);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        String str=sc.nextLine();
        
        System.out.print(solve(str));
    }
}