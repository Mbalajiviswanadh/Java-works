package TCS_TRANING.Previous_Questions;


import java.util.*;


class Replacing_Chars{
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        StringBuilder res = new StringBuilder();
        
        for(char c: str.toCharArray()){
            
            if(c>='a' && c<'z')
            res.append((char)(c+1));
            else if(c=='z')
            res.append('a');
            else if(c>='A' && c<'Z')
            res.append((char)(c+1));
            else if(c=='Z')
            res.append('A');
            else
            res.append(c);
        }
        
        System.out.print(res.toString());

        System.out.println();

       String res2=  Modify_the_string_such_that_every_character_gets_replaced_with_the_next_character_in_the_keyboard(str);
       System.out.println(res2);
    }
    static String CHARS = "qwertyuiopasdfghjklzxcvbnm";
    static int MAX = 26;
    public static String Modify_the_string_such_that_every_character_gets_replaced_with_the_next_character_in_the_keyboard(String str){
        Map<Character, Character> uMap = new HashMap<>();

        for (int i = 0; i < MAX; i++) {
            uMap.put(CHARS.charAt(i),
                     CHARS.charAt((i + 1) % MAX));
        }
        
        char c[]= str.toCharArray();
        // Update the String
        for (int i = 0; i < c.length; i++) {
            c[i] = uMap.get(c[i]);
        }
        return String.valueOf(c);
    }
}