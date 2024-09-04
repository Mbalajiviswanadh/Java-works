package HackerEarth;

import java.util.*;

class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Map<Character, Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        int zcount=map.get('z');
        if(zcount*2 != map.get('o'))
        System.out.print("No");
        else
        System.out.print("Yes");
    }
}