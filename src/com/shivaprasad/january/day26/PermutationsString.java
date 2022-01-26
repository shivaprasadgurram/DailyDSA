package com.shivaprasad.january.day26;

import java.util.ArrayList;
import java.util.List;

public class PermutationsString {

    public static void main(String[] args) {

        String input = "abcd";
        List<String> out = findPermutations(input);
        System.out.println(out);
    }

    public static List<String> findPermutations(String s) {
       List<String> res = new ArrayList<>();
       String output="";
       char[] ch = s.toCharArray();
       boolean freq[] = new boolean[s.length()];
       recurPermute1(ch,output,res,freq);
       return res;
    }

    private static void recurPermute1(char[] ch, String output, List<String> res, boolean[] freq) {

        if(output.length() == ch.length)
        {
            res.add(output);
            return;
        }

        for(int i=0;i<ch.length;i++)
        {
            if(!freq[i])
            {
                freq[i] = true;
                output+=ch[i];
                recurPermute1(ch,output,res,freq);
                output = output.substring(0,output.length()-1);
                freq[i] = false;
            }
        }
    }


}
