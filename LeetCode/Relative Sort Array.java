import java.util.*;


class RelativeSOrt_Array{
    public static int[] relativesort(int arr1[], int arr2[], int n1, int n2){
        int maxvale=0;
        for(int i=0;i<n1;i++){
            maxvale=Math.max(arr1[i],maxvale);
        }

        int count[]= new int[maxvale+1];

        for(int i=0;i<n1;i++){
            count[arr1[i]]++;
        }

        int newarry[]= new int[n1];
        int idx=0;
        for(int i=0;i<n2;i++){
            while(count[arr2[i]]>0){
                newarry[idx]= arr2[i];
                count[arr2[i]]--;
                idx++;
            }
        }    

        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                newarry[idx]=i;
                count[i]--;
                idx++;
            }
        }
        return newarry;
    }
    public static void main(String[] arrgs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr1:");
        int n1=sc.nextInt();

        System.out.println("Enter the values inside :");
        int arr1[]= new int[n1]; 
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of arr2:");
        int n2=sc.nextInt();

        System.out.println("Enter the values inside :");
        int arr2[]= new int[n2]; 
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        sc.close();

        //calling the function
        int res[]= relativesort(arr1, arr2, n1, n2);
        System.out.println("Result:");
        for(int i:res){
            System.out.print(i+" ");

        }
        System.out.println();
        // System.out.println("New Relative Sorted array : "+relativesort(arr1, arr2, n1, n2));
    }
}