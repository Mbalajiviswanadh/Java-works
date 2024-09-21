import java.util.*;
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        String str[]= path.split("/");

        for(int i=0;i<str.length;i++){

            if( str[i].equals("") ||str[i].equals("."))
            continue;

            if(str[i].equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else
            stack.push(str[i]);
        }

        StringBuilder res = new StringBuilder();

        for(String i: stack){
            res.append("/").append(i);
        }

        if(res.length()>0)
        return res.toString();
        else 
        return "/";
        
    }
}
