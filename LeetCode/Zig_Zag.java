import java.util.*;

class Zig_zag{

    // public static String conver(String s, int numRows){
    //     HashMap<Integer,String> hm = new HashMap<>();

    //     int index=0;
    //     int row=1;
    //     boolean increase = true;

    //     while(index < s.length()){

    //         // check if there is a string for this currecnt row

    //         String curString = hm.getOrDefault(row,"");
    //         hm.put(row,curString + s.charAt(index++));

    //         //check if we get up a row or increase 
    //         if(increase){
    //             row++;
    //             //condition for row if it reaches the last row
    //             if(row == numRows){
    //                 increase = false;
    //             }
    //         }
    //         else if(!increase){
    //             row--;
    //             if(row ==1){
    //                 increase = true;
    //             }
    //         }
    //     }

    //     String ans ="";
    //     for(int r : hm.keySet()){
    //         ans= ans+hm.get(r);
    //     }
    //     return ans;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s= sc.nextLine();

        System.out.println("Enter No Of Row: ");
        int numRows= sc.nextInt();

        // System.out.println("Converted String :" +conver(s,numRows));
    }
}