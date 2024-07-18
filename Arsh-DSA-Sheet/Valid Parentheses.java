import java.util.*;

class Valid_parenthese{

    public static boolean solve(String str){

        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){

            if(ch=='('  || ch=='{' || ch=='[')
            stack.push(ch);
            else {
                if(stack.isEmpty())
                return false;
            
                char top= stack.pop();
                if(ch==')' & top!='(' || ch==']' && top!=']' || ch=='{' && top!='}')
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        System.err.println(solve(str));
    }
}