import java.util.*;
class minNo_arrowsToBurst_ballons{
    public static int findMin_arows(int points[][]){
        int arrows=1;
        // Sorting the arry based on second values
        Arrays.sort(points,Comparator.comparingInt(arr -> arr[1]));
        int last_num =points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]>last_num){
                arrows++;
                last_num=points[i][1];
            }
        }
        return arrows;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of  rows and cols :");
        int n =sc.nextInt();
        System.out.println("Enetr the values inside :");
        int points[][]=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                points[i][j]=sc.nextInt();
            }
        }
        // stroing in ArrayList
        List<int[]> pointsList=new ArrayList<>();
        for(int i=0;i<n;i++){
            pointsList.add(points[i]);
        }

        // taken input values 

        for(int values[]:pointsList){
            System.out.print(Arrays.toString(values));
        }
        System.out.println();
        System.out.println("Result Min arrows required are : "+findMin_arows(points));

    }
}