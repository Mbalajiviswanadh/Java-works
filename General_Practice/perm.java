class perm{
    public static void main(String [] args){
        int n = 3;
        int r = 2;
        int p = 1;
        for(int i = n;i>(n-r);i--){
            p *= i;
        }
        System.out.println(p);
        int rfact= 1;
        for(int i = r;i>1;i--){
            rfact *= i;
        }
        System.out.println(p/rfact);

}
}