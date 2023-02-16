package day11_whileLoop;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;
import jdk.nashorn.internal.ir.IfNode;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class c7_assignment1 {

    public static void main(String[] args) {

        //Task 1:
//    Write a Java program to display the middle character of a string in uppercase
//        --> If the length of the string is even number  String will have two middle characters.
//        --> If the length of the string is odd number String  will have one middle character.
//
//    example :
//                Input 1 :  World             Output 1:Middle character is: R
//                Input 2 :  computer          Output 2:Middle character is: PU

        System.out.println("Question 1: ");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your word : ");
       String word= input.nextLine();
      String result;
       int length= word.length();
       System.out.println("Your word length is : "+ length);

      int firstmiddle;
      int secondmiddle;
      int middleword;

       if (length%2==0){
            firstmiddle= length/2-1;
            secondmiddle=length/2;
            result=""+word.charAt(firstmiddle)+word.charAt(secondmiddle);
           System.out.println("middle characters are  " + result.toUpperCase());

        }else if (length%2!=0){
           middleword= length/2;
           result=""+word.charAt(middleword);
           System.out.println("middle character is: "+ result.toUpperCase());

       }else{
           System.out.println("Wrong Word");
       }

        System.out.println("--------------------");
        System.out.println(" ");

//                .....
//#3 - Ask user to enter two words. Then add them together and print. But if the last letter of the first word and the first letter of the last letter is the same,
// print that character once.
//                    Input:
//                        one
//                        eight
//                    Output:
//                        oneight

        System.out.println("Question 2 : ");
        Scanner output=new Scanner(System.in);
        System.out.println("Enter your first word : ");
        String word1=output.nextLine();


        System.out.println("Enter your second word : ");
        String word2=output.nextLine();

        String result1;
        String word1lastletter= ""+word1.charAt(word1.length()-1);
     String word2firstletter =""+word2.charAt(0);


     if (word1lastletter.equalsIgnoreCase(word2firstletter)){
         System.out.println(word1.concat(word2.substring(1)));
     } else {
         System.out.println(word1.concat(word2));
     }
        System.out.println("--------------------");
        System.out.println(" ");

     //task 4. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
        System.out.println("Question 3 : ");
        int sum=0;
        for (int i=0; i<=100; i++){
        if (i%2 !=0 && i%3==0 && i%5==0){
            System.out.println(i);
        sum +=i;
       }
    }
        System.out.println("Sum is : "+sum);
        System.out.println("--------------------");
        System.out.println(" ");

    //task 5. write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5
        System.out.println("Question 4 : ");
        int sum1=0;
        for (int in=0; in<=100; in++){
            if(in%2==0 && in%3==0 && in%5==0){
                System.out.println(in);
                sum1+=in;
            }
        }
        System.out.println("Sum is : "+sum1);

        System.out.println("--------------------");
        System.out.println(" ");
/*
  task 6. write a program that can return the factorial number of any given number
            Ex:
                input: 6
                output: 720

            because:
                6! = 6 * 5 * 4 * 3 * 2* 1 = 120

                15!= 15 * 14 *.....* 1
 */
        System.out.println("Question 5 : ");
        Scanner esra= new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number= esra.nextInt();
        int factorial= 1;

        for (int i=1; i<=number; i++){
            factorial *= i;
        }
        System.out.println( " Factorial number of your given number : "+factorial );
    }
}
