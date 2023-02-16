package day16_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class c8_assignment {
    //// write a method that will take 3 parameters
//    // 2 numbers and one operator
//    // it will do the calculation
//
//    //ex : 200 100 +
//    //result 300
//
//    //ex 15 3 *
//    //result 45

    // public static void c8calculator(int number1, int number2 ) {

    public static void sum(int number1, int number2) {
        int x = number1;
        int y = number2;
        System.out.println(number1 + "+" + number2 + "=" + (number1 + number2));
    }

    public static void mult(int number1, int number2) {
        int x = number1;
        int y = number2;

        System.out.println(number1 + "*" + number2 + "=" + (number1 * number2));
    }


    public static void main(String[] args) {
        System.out.println("Question 1");
        sum(200, 100);
        mult(15, 3);


        //write a program that can return the count of "java" and "javascript" anywhere in the sentence
        //String sentence = "I like java and javascript,java is best, java and javascript,java ";

        System.out.println("--------------------");
        System.out.println("Question 2");
        String sentence = "I like java and javascript, java is best, java and javascript, java ";
        String[] letters = sentence.split(" |, ");
        System.out.println(Arrays.toString(letters));

        int javacount = 0;
        int javascriptcount = 0;

        for (String words : letters) {
            if (words.equalsIgnoreCase("java")) {
                javacount++;
            }
        }
        for (String words : letters) {
            if (words.equalsIgnoreCase("javascript")) {
                javascriptcount++;
            }
        }

        System.out.println("Java's count is : " + javacount);
        System.out.println("Javascript's count is : " + javascriptcount);
        System.out.println("--------------------");

        /*Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B

                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C
 */
        System.out.println("Question 3 : ");


        System.out.println("No answer ");


            //write a method that can identify if a string is palindrome
//            ex: palindrome("mom")  ==> true
//                palindrome("hello") ==> false

            Scanner input = new Scanner(System.in);
            System.out.println("--------------------");
            System.out.println("Question 4 : ");
            System.out.println("Enter your word : ");
            String word = input.nextLine();

            String[] words = word.split("");
            String reverse = "";


            for (int i = words.length - 1; i >= 0; i--) {
                reverse += words[i];
                //  System.out.println(reverse);
            }
            if (word.equalsIgnoreCase(reverse)) {
                System.out.println(word + " is palindrone. ");
            } else {
                System.out.println(word + " is not palindrone. ");
            }

        }
    }











