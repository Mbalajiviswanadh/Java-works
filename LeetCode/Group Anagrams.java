import java.util.*;

class GroupAnagrams {


    public  List<List<String>> groupinganagrams(String strs[],int n){
        Map<String,List<String>> map=new HashMap<>();

        for(String s: strs){
            char chararray[]= s.toCharArray();
            Arrays.sort(chararray);

            String sortedarray= new String(chararray);

            if(!map.containsKey(sortedarray)){
                map.put(sortedarray, new ArrayList<>());
            }

            map.get(sortedarray).add(s);
        }
        return new ArrayList<>(map.values());
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no  of the Strings:");
        int n =sc.nextInt();
        sc.nextLine();
        String strs[] = new String[n];
        System.out.println("Enter the Strings inside: ");
        for(int i=0;i<n;i++){
            strs[i]=sc.nextLine();
        }

        // calling the function
        GroupAnagrams sol = new GroupAnagrams();
        List<List<String>> res = sol.groupinganagrams(strs, n);
        System.out.println("Grouped Anagrams:");
        for(List<String> ans : res){
            System.out.print(ans);
        }
        sc.close();

        
    }
}
