package day08_String;

import java.nio.charset.StandardCharsets;

public class deneme_StringMethods2 {

    public static void main(String[] args) {

        String word1= "Hello";
        String word2= "Hello";
        String word3= new String("Hello");
        String word4= new String("Hello");
        String word5="Java";


        System.out.println(word1.equals(word2));
        System.out.println(word1.equals(word3));
        System.out.println(word2.equals(word3));
        System.out.println(word3.equals(word4));
        System.out.println(word1.equals(word5));



        System.out.println("**************");
        System.out.println(word1==word2);
        System.out.println(word1==word3);
        System.out.println(word2==word3);
        System.out.println(word3==word4);
        System.out.println(word1==word5);


        System.out.println("*********");


        String str1="Java";
        String str2="java";
        String str3= "JAvA";


        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str2));


        boolean b1= str1.equalsIgnoreCase(str3); // true
        boolean b2= str1.equals(str2); //false
        boolean b3= str3.equalsIgnoreCase(str1); //true

        if (b1){
            System.out.println("b1 is true");
            if (b2){
                System.out.println("b2 is true");
                if(b3){
                    System.out.println(" b3 is true");
                }else {
                    System.out.println("b3 is false");
                }


            }else {
                System.out.println("b2 is false");
            }


        }else{

            System.out.println("b1 is false");
        }





    }




}
