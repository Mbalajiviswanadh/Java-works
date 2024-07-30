import java.util.*;
class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();

        int currnum=0;
        int op='+';

        for(int i=0;i<s.length();i++){

            char c = s.charAt(i);

            if(Character.isDigit(c))
            currnum= currnum*10+(c-'0');

            if(!Character.isDigit(c) && c!=' ' || i==s.length()-1){

                if(op=='+')
                stack.push(currnum);
                else if(op=='-')
                stack.push(-currnum);
                else if(op=='*')
                stack.push(stack.pop() * currnum);
                else if(op=='/')
                stack.push(stack.pop() / currnum);

                op=c;
                currnum=0;
            }
        }
        int res=0;
        while(!stack.isEmpty()){
            res+=stack.pop();
        }
        return res;
    }
}