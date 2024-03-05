package UNI_STS.Stacks;

import java.util.*;
class FInding_Celb {

    public static boolean a_knows_b(int a,int b,int matrix[][]){
        return matrix[a][b]==1;
    }

    public static int findingCelb(int matrix[][]){
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<matrix.length;i++){
            st.push(i);
        }

        while(st.size()>1){
            int a=st.pop();
            int b=st.pop();
            if(a_knows_b(a,b,matrix)){
                // pushing the b inside the stack if the a know b
            st.push(b);
            }
            else
            st.push(a);
            
        }
        // now checking the rows and cols for celeb
        int celb=st.pop();
        for(int i=0;i<matrix.length;i++){
            if(i!=celb && (a_knows_b(celb, i, matrix) || !a_knows_b(i, celb, matrix))  ){
                return 0;
            }
        }
        return celb;
}


    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the rows and columns for matrix:");        
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){

                matrix[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        int result =findingCelb(matrix);

        if(result==0){
            System.out.println("No celb");
        }
        else{

            System.out.println("Result Celb is :" +result);
        }

        
    }
}
