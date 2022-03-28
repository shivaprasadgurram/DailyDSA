package com.shivaprasad.march.day87;

public class DefangingAnIPAddress {

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
    static String defangIPaddr(String address) {

        return address.replace(".","[.]");
    }
}
