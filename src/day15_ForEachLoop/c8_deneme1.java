package day15_ForEachLoop;

import java.util.Arrays;

public class c8_deneme1 {
    public static void main(String[] args) {

////create a condition that will reverse given sentence
//        //ex: Java is fun
//        //output should be fun is java

       // this example reverse the sentence,

        String sentence="Java is fun";
        String[]splitedsentence=sentence.split(" ");
        System.out.println(Arrays.toString(splitedsentence));

        String reversesentence="";
        for (int i= splitedsentence.length-1; i>=0; i--){

            reversesentence+=splitedsentence[i]+ " ";
            System.out.println("in the loop "+reversesentence);
        }

        System.out.println("==============");
        System.out.println(reversesentence);


        System.out.println("==============");
        ////create a condition that will reverse given string
//        //ex: Java is fun
//        //output should be nuf si avaJ
        // this example reverse the string;

        String sentence2="Java is fun";
        String[]splitedsentence2=sentence2.split("");

        String reverseString2="";
        for (int i= splitedsentence2.length-1; i>=0; i--){
            reverseString2+=splitedsentence2[i];
        }

        System.out.println(reverseString2);















    }
}
