class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s.length()%2!=0) 
        return false;

        int balance =0;
        int available_zeros_in_locked =0;

        for(int i=0;i<s.length();i++){

            if(locked.charAt(i)=='0')
            available_zeros_in_locked++;
            else{
                if(s.charAt(i)=='(')
                balance++;
                else
                balance--;
            }

            if(balance+available_zeros_in_locked <0)
            return false;
        }

        balance=0;
        available_zeros_in_locked=0;

        for(int i=s.length()-1;i>=0;i--){

            if(locked.charAt(i)=='0')
            available_zeros_in_locked++;
            else{
                if(s.charAt(i)==')')
                balance++;
                else
                balance--;
            }

            if(balance+available_zeros_in_locked <0)
            return false;
        }

        return true;

        /*
        Stack<Integer> openIdx = new Stack<>();
        Stack<Integer> unlockedIdx= new Stack<>();

        for(int i=0;i<s.length();i++){

            if(locked.charAt(i)=='0')
            unlockedIdx.push(i);
            else if(s.charAt(i)=='(')
            openIdx.push(i);
            else if(s.charAt(i)==')'){
                if(!openIdx.isEmpty())
                openIdx.pop();
                else if(!unlockedIdx.isEmpty())
                unlockedIdx.pop();
                else 
                return false;
            }
        }

        while(!openIdx.isEmpty() && !unlockedIdx.isEmpty() && openIdx.peek() <unlockedIdx.peek()){
            openIdx.pop();
            unlockedIdx.pop();
        }

        if(openIdx.isEmpty() && !unlockedIdx.isEmpty()){
            return unlockedIdx.size()%2==0;
        }

        return openIdx.isEmpty();

        */


    }
}