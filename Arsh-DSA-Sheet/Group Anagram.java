import java.util.*;

class GroupAnnagram{

    public static List<List<String>> solve(String[] str){

        Map<String, List<String>> map = new HashMap<>();

        for(String s : str){
            char ch[]= s.toCharArray();

            Arrays.sort(ch);

            String sortedstr = new String(ch);

            if(!map.containsKey(sortedstr))
            map.put(sortedstr, new ArrayList<>());

            map.get(sortedstr).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();
        }
        List<List<String>> res = solve(str);
        for(List<String> i : res){
            System.out.println(i+" ");
        }
    }
}