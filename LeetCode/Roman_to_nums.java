// package LeetCode;

// import java.util.*;
// class Roman_to_nums {

//     public static int roman_to_nums(String arr_s,String n){


//         //using the "HashMap" for mapping the Character and Integers
//         HashMap<Character,Integer> map= new HashMap<>();

//         map.put('I',1);
//         map.put('V',5);
//         map.put('X',10);
//         map.put('L',50);
//         map.put('C',100);
//         map.put('D',500);
//         map.put('M',1000);

//         // we are adding and giving conditions from RIGHT to LEFT which means end of the array to start of the array 
//         //here, we initialy are asging the result to the last Character of the array.
//         int result = map.get(arr_s.charAt(arr_s.length()-1));

//         for(int i=arr_s.length()-2;i>=0;i--){
//             if(map.get(arr_s.charAt(i)) < map.get(arr_s.charAt(i+1))){

//                 //if last-but-one is lesser than last one, we need to substract with last one to the last-but-one

//                 result -= map.get(arr_s.charAt(i));
//             }
//             else{
//                 result += map.get(arr_s.charAt(i));

//             }
//         }
//         return result;
//     }



    
//     public static void main(String[] args) {
        
//         cha arr_s[]={"I","V","X","L","C","D","M"};

//         // Scanner sc = new Scanner(System.in);

//         // System.out.println("Enter Roman nums using {'I','V','X','L','C','D','M'} :");
//         String n = "MCMXCIV";

//         //calling the function

//         int result= roman_to_nums(arr_s, n);
//         System.out.print("The Final result : "+result);


        
        
        

//     }
// }
