import java.util.*;
class BackspaceStringCompare {

    public static String check(String str){
        Stack<Character> stack = new Stack<>();

        for(char c:str.toCharArray()){
            if(c!='#')
            stack.push(c);
            else if(!stack.isEmpty())
            stack.pop();
        }

        return String.valueOf(stack);
    }

    public static boolean solve(String s, String t){
        return check(s).equals(check(t));
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();

        System.out.println(solve(s,t));
    }
}
