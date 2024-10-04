package TCS_TRANING.OCT_3_paper_codes;


import java.util.*;

class main{
    
    public static boolean ispalindrom(int num){
        
        int reverse=0;
        
        int og=num;
        
        while(num>0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num/=10;
        }
        
        return (reverse==og);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a =sc.nextInt();
        int b=sc.nextInt();
        
        int count=0;
        List<Integer> list = new ArrayList<>();
        for(int i=a;i<=b;i++){
            
            if(ispalindrom(i)){
                count++;
                list.add(i);
            }
        }
        
        System.out.println(count);
        System.out.print(list);
        
        
    }
}