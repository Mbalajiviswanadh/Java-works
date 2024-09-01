package GCD_or_HCF_of_two_Strings;

import java.util.
class Solution {
    public int gcdOf_sand_t(int a, int b){

        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str2+str1).equals(str1+str2))
        return "";

        int gcd=gcdOf_sand_t(str1.length(), str2.length());

        return str1.substring(0,gcd);
    }
};
