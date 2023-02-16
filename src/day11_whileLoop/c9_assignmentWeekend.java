package day11_whileLoop;

import java.util.Scanner;

public class c9_assignmentWeekend {



    public static void main(String[] args) {

//Create a Java Program to Print an Integer (Entered by the User)
        System.out.println("Question 1 : ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int int1 = input.nextInt();
        System.out.println(int1 + " is an integer number");
        System.out.println("--------------------");

//Create a Java Program to Add Two Integers
        System.out.println("Question 2 : ");
        System.out.println("Write first number : ");
        int in1 = input.nextInt();
        System.out.println("Write second number : ");
        int in2 = input.nextInt();

        int sum = in1 + in2;
        System.out.println(in1 + " and " + in2 + " are integer number ");
        System.out.println("--------------------");

//Create a Java Program to Multiply two Floating Point Numbers

        System.out.println("Question 3 : ");
        System.out.println("Enter your first float number : ");
        float f1 = input.nextFloat();
        System.out.println("enter your second float number : ");
        float f2 = input.nextFloat();

        float mult = f1 * f2;
        System.out.println("Two floating numbers multiply is : " + mult);
        System.out.println("--------------------");

//Create a Java Program to Find ASCII Value of a character

        System.out.println("Question 4 : ");
        char c1 = 'Y';
        int ch1 = c1;
        System.out.println("The Ascii value of " + c1 + " is " + ch1);
        System.out.println("--------------------");

//Create a Java Program to Compute Quotient and Remainder
        System.out.println("Question 5 : ");
        System.out.println("Enter First Number For Divide : ");
        int quo = input.nextInt();
        System.out.println("Enter your second number For Divider : ");
        int rem = input.nextInt();
        int div = quo / rem;
        int reminder = quo % rem;
        System.out.println("The quotient is " + div);
        System.out.println("The remainder is " + reminder);
        System.out.println("--------------------");

//Create a Java Program to Swap Two Numbers
        System.out.println("Question 6 : ");
        System.out.println("Enter one number : ");
        int x = input.nextInt();
        System.out.println("Enter your second number : ");
        int y = input.nextInt();
        System.out.println("Before Swapping of your numbers : " + x + " - " + y);
        int z = x;
        x = y;
        y = z;
        System.out.println("After Swapping your numbers : " + x + " - " + y);
        System.out.println("--------------------");

        //Create a Java Program to Check Whether a Number is Even or Odd
        System.out.println("Question 7 : ");
        System.out.println("Enter one number : ");
        int eo = input.nextInt();
        if (eo % 2 == 0) {
            System.out.println(eo + " is even number. ");
        } else {
            System.out.println(eo + " is odd number. ");
        }
        System.out.println("--------------------");

        //Create a Java Program to Check Whether an Alphabet is Vowel or Consonant
        System.out.println("Question 8 : ");
        System.out.println("Enter your letter");
        String ltr = input.nextLine();
        int let = 0;
        char cha = input.next().charAt(0);

        if (cha == 'a' || cha == 'A' || cha == 'e' || cha == 'E' || cha == 'i' || cha == 'I' || cha == 'o' || cha == 'O' || cha == 'u' || cha == 'U') {
            System.out.println("Your entered letter is " + cha + " , and this is vowel letter. ");
        } else {
            System.out.println("Your entered letter is consonant letter. ");
        }
        System.out.println("--------------------");

        //Create a Java Program to Find the Largest Among Three Numbers
        System.out.println("Question 9 : ");
        System.out.println("Enter your first number : ");
        int first = input.nextInt();
        System.out.println("Enter your second number : ");
        int second = input.nextInt();
        System.out.println("Enter your third number : ");
        int third = input.nextInt();

        if (first > second && first > third) {
            System.out.println(" Largest number is " + first);
        } else if (second > first && second > third) {
            System.out.println("Largest number is " + second);
        } else {
            System.out.println("Largest number is " + third);
        }
        System.out.println("--------------------");

//Create a Java Program to Check Leap Year
        System.out.println("Question 10 : ");
        System.out.println("Enter your year : ");
        int year1 = input.nextInt();
        if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 100 == 0 && year1 % 400 == 0)) {
            System.out.println(year1 + " is a leap year . ");
        } else {
            System.out.println(year1 + " is not a leap year . ");
        }
        System.out.println("--------------------");

        //Create a Java Program to Check Whether a Number is Positive or Negative
        System.out.println("Question 11 : ");
        System.out.println("Enter your number : ");
        int p = input.nextInt();

        if (p >= 0) {
            System.out.println(p + " is a positive number . ");
        } else {
            System.out.println(p + " is a negative number . ");
        }
        System.out.println("--------------------");

        //Create a Java Program to Check Whether a Character is Alphabet or Not
        System.out.println("Question 12 : ");
        char ch;
        System.out.println("Enter your character : ");
        ch = input.next().charAt(0);
        String result = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ? ch + " is an alphabet . " : ch + " is not an alphabet . ";
        System.out.println(result);
        System.out.println("--------------------");


        //Create a Java Program to Calculate the Sum of Natural Numbers
        System.out.println("Question 13 : ");
        System.out.println("Enter your number : ");
        int dgl = input.nextInt();
        sum = 0;
        for (int i = 1; i <= dgl; i++) {
            sum += i;
        }
        System.out.println("The sum of your natural number is : " + sum);
        System.out.println("--------------------");

        //Create a Java Program to Find Factorial of a Number
        System.out.println("Question 14 : ");
        System.out.println("Enter your number : ");
        int fctr = input.nextInt();
        int factorial = 1;
        for (int i1 = 1; i1 <= fctr; i1++) {
            factorial *= i1;
        }
        System.out.println("Your number's factorial is " + factorial);
        System.out.println("--------------------");

//Create a Java Program to Generate Multiplication Table
        System.out.println("Question 15 : ");
        System.out.println("Enter your number : ");
        int tb = input.nextInt();

        for (int i2 = 1; i2 <= 10; i2++) {
            int multily = i2 * tb;
            System.out.println(tb + " * " + i2 + " = " + multily);
        }
        System.out.println("--------------------");

        //Create a Java Program to Display Fibonacci Series
        System.out.println("Question 16 : ");

        System.out.println("--------------------");

        //Create a Java Program to Display Alphabets (A to Z) using loop

        System.out.println("Question 17 : ");
        System.out.println("Alphabets are : ");
        char a;
        for (a = 'A'; a <= 'Z'; a++) {
            System.out.println(a + "");
        }
        System.out.println("--------------------");

        //Create a Java Program to Count Number of Digits in an Integer
        System.out.println("Question 18 : ");
        System.out.println("--------------------");

//Create a Java Program to Reverse a Number
        System.out.println("Question 19 : ");
        System.out.println("--------------------");

//Create a Java Program to Calculate the Power of a Number
        System.out.println("Question 20 : ");
        System.out.println("--------------------");

//Create a Java Program to Check Palindrome
        System.out.println("Question 21 : ");
        System.out.println("--------------------");
//Create a Java Program to Check Whether a Number is Prime or Not
        System.out.println("Question 22 : ");
        System.out.println("--------------------");
//Create a Java Program to Display Prime Numbers Between Two Intervals
        System.out.println("Question 23 : ");
        System.out.println("--------------------");
//Create a Java Program to Check Armstrong Number
        System.out.println("Question 24 : ");
        System.out.println("--------------------");

//Create a Java Program to Make a Simple Calculator Using switch...case
        System.out.println("Question 25 : ");
        System.out.println("--------------------");


    }
}
