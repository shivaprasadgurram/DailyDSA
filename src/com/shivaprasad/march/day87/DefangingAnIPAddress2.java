package com.shivaprasad.march.day87;

public class DefangingAnIPAddress2 {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
    static String defangIPaddr(String address) {

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i) == '.')
                sb.append("[.]");
            else
                sb.append(address.charAt(i));
        }

        return sb.toString();
    }
}
