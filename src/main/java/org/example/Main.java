package org.example;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String first_str="Amruta";
        String first_str_clone="Amruta";
        String first_str_obj=new String("Amruta");
        System.out.println("first character: "+first_str.charAt(0));
        System.out.println("character at last index: "+first_str.charAt(first_str.length()-1));
        char[] first_str_array= first_str.toCharArray();
        for(int i=0; i<first_str_array.length;i++){
            System.out.println("character At index : "+i +" is : "+first_str_array[i]);
        }
        String second_str="Pramod";
        System.out.println("does first_str and second_str are equal: "+first_str.compareTo(second_str));
        System.out.println("does first_str and amruta are equal: "+first_str.compareTo("amruta"));
        System.out.println("does first_str and amruta are equal by ignoring case: "+first_str.compareToIgnoreCase("amruta"));

        System.out.println("does first_str and second_str are equal: "+ first_str.equals(second_str) );
        System.out.println("does first_str and amruta are equal: "+first_str.equals("amruta"));
        System.out.println("does first_str and Amruta are equal: "+first_str.equals("Amruta"));

        System.out.println("XXXX "+String.valueOf(first_str==first_str_clone));
        System.out.println("YYYY "+String.valueOf(first_str==first_str_obj));

        System.out.println("First Concat optn: "+first_str+second_str);
        System.out.println("First Concat optn: "+first_str.concat(second_str));


        //Problem 1: Sequence check
        // traverse str "abcde"
        // traverse seq "aec" <-- false
        // traverse seq "bcd" <--true

        String str="pramod";
        String seq="moooon";
        char[] str_array=str.toCharArray();
        char[] seq_arr=seq.toCharArray();
        boolean sequence_match=false;
        for(int i=0;i<str_array.length;i++){
            int match_count=0;
            int main_str_index = i;

            if(str.charAt(i)==seq.charAt(0)){
                for(int j=0;j<seq_arr.length;j++){
                    if(str.charAt(main_str_index)!=seq.charAt(j)){
                        break;
                    }else{
                        main_str_index+=1;
                        match_count+=1;
                    }
                }
                if(match_count==seq_arr.length) sequence_match=true;
            }
        }
        System.out.println("sequence_match: "+sequence_match);
        System.out.println("isSubsequence_1: "+isSubsequence("abcde","ab"));
        System.out.println("isSubsequence_1: "+isSubsequence("abcde","abd"));

        System.out.println("isSubsequence_1: "+isSubsequence("abcde","aec"));
        System.out.println("isSubsequence_1: "+isSubsequence("abcade","da"));

    }

    public static boolean isSubsequence(String str, String seq) {
        int i = 0; // traverse str "abcde"
        int j = 0; // traverse seq "aec"

        while (i < str.length() && j < seq.length()) {
            if (str.charAt(i) == seq.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == seq.length();
    }
}