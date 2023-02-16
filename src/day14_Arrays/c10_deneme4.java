package day14_Arrays;

import java.util.Arrays;

public class c10_deneme4 {
    public static void main(String[] args) {

        String str= "*& Java  12 Ghost ESther";
        char[] letters=str.toCharArray();
        System.out.println(letters[3]);
        System.out.println(Arrays.toString(letters));
        System.out.println(letters[7]);

        System.out.println("---------------");
        String mySentence="Java is fun";

//String[] splitedSentence=mySentence.split(" ");
        String[]splitedSentence=mySentence.split("");
        System.out.println(Arrays.toString(splitedSentence));




    }
}
