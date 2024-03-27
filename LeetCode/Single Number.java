import java.util.*;

class Single_Num{

    public static int singleNUm(List<Integer> l){

        int res=0;
        for(int i:l){
            res^=i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n =sc.nextInt();

        System.out.println("ENter the values inside :");
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            System.out.print(l.get(i)+" ");
        }
        System.out.println();

        System.out.println("Result : "+singleNUm(l));

    }
}