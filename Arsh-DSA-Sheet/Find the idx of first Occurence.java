class Solution {
    public int strStr(String h, String n) {
        int hsize=h.length();
        int nsize=n.length();

        if(hsize<nsize)
        return -1;

        for(int i=0;i<=hsize-nsize;i++){

            int j=0;
            while(j<nsize && h.charAt(i+j)==n.charAt(j)){
                j++;
            }

            if(j==nsize)
            return i;
        }
        return -1;
    }
}