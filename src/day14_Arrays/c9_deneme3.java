package day14_Arrays;

import java.util.Arrays;

public class c9_deneme3 {
    public static void main(String[] args) {

        String []names={"hello", "world", "java", "pyton", "sevgin", "renastechschool", "JS"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        //in ascii table
        // A 65     a 97
        // Z 90     z 122

        // lets assume first word has max length
        // lets assume first word has min length

        int maxlength=names[0].length();
        int minlength=names[0].length();

        // lets assume largest and shortest string
        String longestname=names[0];
        String shortestname=names[0];

        for (int i=0; i<names.length; i++){
            if (names[i].length()> maxlength){
                maxlength=names[i].length();
                longestname= names[i];
            }
            if (names[i].length()< minlength){
                minlength=names[i].length();
                shortestname=names[i];
            }
        }

        System.out.println(longestname);
        System.out.println(shortestname);









    }
}
