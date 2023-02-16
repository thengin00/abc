package day17_ReturnMethods;

import java.util.Scanner;

public class c8_deneme4returnmethods {
    public static void main(String[] args) {
        String firstname = "Hello";
        String lastname = "World";

        System.out.println(firstname.concat(lastname));


        System.out.println(concatStrings("Hello", "World"));
        System.out.println(concatStrings("Mehmet", "Cakar"));

        //Scanner input = new Scanner(System.in);
       // String firstname3 = input.next();
        //String lastname3 = input.next();
       // System.out.println(concatStrings(firstname3, lastname3));


        boolean result = equalnames("hello", "world");
        System.out.println(result);

        boolean result1= equalnames1("sarp", "sarp",45,45);
        System.out.println(result1);

    }

    // create a return method that will concat 2 different string

    public static String concatStrings(String firstname1, String lastname2) {


        return firstname1.concat(lastname2);

    }
    // create a logic that will check given names are equal
    // 2 string to compare 2 parameters
    // to be able to compare you need equals
    // return typa as boolean

    public static boolean equalnames(String str1, String str2) {
        return str1.equals(str2);
    }

    //whatever you want to have as a return make sure your method type is same as return
    // parameters are what ever you wanted to pass your method

    public static boolean equalnames1(String str1, String str2, int number, int number2) {
        return str1.equals(str2) && number == number2;
    }
}