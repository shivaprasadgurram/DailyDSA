package com.shivaprasad.march.day64;

import java.util.HashMap;
import java.util.UUID;

public class EncodeAndDecodeTinyURL {
    static HashMap<String,String> map = new HashMap<>();
    public static void main(String[] args) {
        EncodeAndDecodeTinyURL obj = new EncodeAndDecodeTinyURL();
        String tiny = obj.encode("https://leetcode.com/problems/design-tinyurl");
        String original = obj.decode(tiny);
        System.out.println(original);
        System.out.println(tiny);
    }

    static String encode(String longUrl) {
        String tinyUrl = longUrl.substring(0,8) + UUID.randomUUID().toString()+"/tiny";
        map.put(tinyUrl,longUrl);
        return tinyUrl;
    }

    static String decode(String shortUrl) {
        if(map.containsKey(shortUrl))
            return map.get(shortUrl);
        return "";
    }
}
