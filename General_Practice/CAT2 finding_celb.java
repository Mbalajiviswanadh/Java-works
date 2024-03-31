import java.util.*;

class finding_celb{

    public static boolean a_knows_b(int matrix[][],int a,int b){
        return matrix[a][b]==1;
    }

    public static int findingceleb(int matrix[][]){
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<matrix.length;i++){
            s.push(i);
        }

        while(s.size()>1){
            int a=s.pop();
            int b=s.pop();
            if(a_knows_b(matrix,a,b)){
                s.push(b);
            }else
            s.push(a);
        }

        int celb=s.pop();

        for(int i=0;i<matrix.length;i++){
            if(i!=celb && a_knows_b(matrix,celb, i) || !a_knows_b(matrix,i, celb) ){
                return 0;
            }
        }
        return celb;
    } 
    public static void main(String[] args) {
        
    }
}