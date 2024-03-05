import java.util.*;
class deletingSimilar_ends {
    public static int findingthe_sizeofTheSring_afterDeleting(String s){
        int final_size=s.length();
        int prefix=0;
        int suffix=s.length()-1;

        while (suffix>=prefix) {
            if(s.charAt(prefix)==s.charAt(suffix)){
                char currChar=s.charAt(prefix);

                while(suffix>=prefix && s.charAt(prefix)==currChar){
                    prefix++;
                    final_size--;
                }
                while(suffix>=prefix && s.charAt(suffix)==currChar){
                    suffix--;
                    final_size--;
                }
            }
            else
            break;
        }
        return final_size;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the Sting:");
        String s = sc.nextLine();
    }
}
