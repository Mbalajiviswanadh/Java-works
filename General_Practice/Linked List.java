import java.util.*;
class Linked_List {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("name");
        list.addLast("is");
        list.add("Vissy");
        list.addFirst("my");

        int size =list.size();
        
        System.out.println(list);
        System.out.println(size);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) +" -> ");
        }
        System.out.println("NULL");
    }
}
