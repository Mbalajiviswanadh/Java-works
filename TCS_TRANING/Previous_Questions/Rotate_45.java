package TCS_TRANING.Previous_Questions;


import java.util.*;
class HelloWorld {
    
    public static List<Integer> solve(int mat[][], int n){
        List<Integer> list = new ArrayList<>();
        
        int mid=n/2-1;
        
        for(int j=0;j<n;j++){
            for(int i=mid;i>=0;i--){
                list.add(mat[i][j]);
            }
            
            for(int k=mid+1;k<n;k++){
                list.add(mat[k][j]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int mat[][]= new int[n*n][n*n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        
        List<Integer> res = solve(mat,n);
        for(int i: res){
            System.out.print(i+" ");
        }
        
    }
}