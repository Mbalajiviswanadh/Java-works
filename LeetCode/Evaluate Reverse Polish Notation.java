import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(String s : tokens){

            if(s.equals("+")){

                if(!stack.isEmpty()){
                    int sec=stack.pop();
                    int fis=stack.pop();

                    stack.push(fis+sec);
                }
            }
            else if(s.equals("-")){

                if(!stack.isEmpty()){
                    int sec=stack.pop();
                    int fis=stack.pop();

                    stack.push(fis-sec);
                }
            }
            else if(s.equals("*")){
                if(!stack.isEmpty()){
                    int sec=stack.pop();
                    int fis=stack.pop();

                    stack.push(fis*sec);
                }
            }
            else if(s.equals("/")){
                if(!stack.isEmpty()){
                    int sec=stack.pop();
                    int fis=stack.pop();

                    stack.push(fis/sec);
                }
            }
            else
            stack.push(Integer.parseInt(s));
        }
        return stack.pop();
    }
}