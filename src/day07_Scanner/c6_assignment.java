package day07_Scanner;

import jdk.nashorn.internal.ir.IfNode;

import java.sql.SQLOutput;
import java.util.Scanner;

public class c6_assignment {


    public static void main(String[] args) {

        //Question 1
        //Even or Odd
        //Write a program that asks the user to enter a number and displays whether entered number is an odd number or even number.

        System.out.println("Enter a number - I will tell you if it is even or odd: ");
        Scanner outline = new Scanner(System.in);

        int i1 = outline.nextInt();

        if (i1 % 2 == 0) {
            System.out.println(i1 + " is even number. ");

        } else {

            System.out.println(i1 + " is odd number");
        }

        //
        //Question 2
        //Absolute value
        //Write a program that asks the user to enter a number and displays the absolute value of that number.
        //

        System.out.println("Now let's find an absolute number. Please enter it here: ");
        Scanner absolute = new Scanner(System.in);
        short abs = absolute.nextShort();

        if (abs < 0) {

            abs = (short) (abs * -1);
            System.out.println("The absolute number for " + -abs + " is " + abs);


        } else if (abs > 0) {

            System.out.println("The absolute number for " + abs + "is" + abs);
        } else {

            System.out.println("The absolute number is invalid for " + abs);
        }


        //Question 3
        //Discount and Revenue
        //Revenue can be calculated as the selling price of the product times the quantity sold, i.e. revenue = price × quantity.
        // Write a program that asks the user to enter product price and quantity and then calculate the revenue. If the revenue is more than 5000 a discount
        // is 10% offered. Program should display the discount and net revenue.
        //



        System.out.println("Enter the product price: ");
        Scanner price = new Scanner(System.in);
        int pr = price.nextInt();
        System.out.println(pr);

        System.out.println("Enter the quantity : ");
        Scanner quantity = new Scanner(System.in);
        int qn = quantity.nextInt();
        System.out.println(qn);

        int revenue = qn * pr;
        int discount = revenue * 10 / 100;

        if (revenue > 5000) {
            System.out.println("Your discount is 10% " + discount + " You will pay only " + (revenue - discount));

        } else {

            System.out.println(" Your revenue is " + revenue + " You don't have discount");
        }
        //Question 4
        //Largest Number
        //Write a program that asks the user to enter a numbers in three variables and then displays the largest number.
        //


        Scanner maximum = new Scanner(System.in);
        int in1 = maximum.nextInt();
        int in2 = maximum.nextInt();
        int in3 = maximum.nextInt();

        System.out.println("Enter first number : ");
        System.out.println(in1);

        System.out.println("Enter second number : ");
        System.out.println(in2);

        System.out.println("Enter third number : ");
        System.out.println(in3);

        if (in1 > in2 && in1 > in3) {
            System.out.println("Maximum number is " + in1);
        } else if (in2 > in1 && in2 > in3) {
            System.out.println("Maximum number is " + in2);
        } else {
            System.out.println("Maximum number is " + in3);
        }

        //Question 5
        //Positive, negative or zero
        //Write a program that prompts the user to input a number.
        // The program should then output the number and a message saying whether
        // the number is positive, negative, or zero.
        System.out.println("Enter a number : ");
        Scanner type = new Scanner(System.in);
        int nb1 = type.nextInt();


        if (nb1 > 0) {
            System.out.println(nb1 + " is positive number ");
        } else if (nb1 < 0) {
            System.out.println(nb1 + " is negative number ");
        } else {
            System.out.println("Number is zero ");
        }

//Question 6
//
//Valid Triangle
//A triangle is valid if the sum of all the three angles is equal to 180 degrees.
// Write a program that asks the user to enter three integers as angles and
// check whether a triangle is valid or not.
//

        Scanner triangle = new Scanner(System.in);
        int nm1 = triangle.nextInt();
        System.out.println("Enter first number : ");
        int nm2 = triangle.nextInt();
        System.out.println("Enter second number : ");
        int nm3 = triangle.nextInt();
        System.out.println("Enter third number : ");

        if (nm1 + nm2 + nm3 == 180) {
            System.out.println(" The triangle is valid. ");
        } else {
            System.out.println("The triangle is invalid. ");
        }


        //Question 7
        //Leap Year
        //Any year is input by the user. Write a program to determine whether the year is a leap year or not.
        //Leap Years are any year that can be evenly divided by 4.
        // A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.
        //
        //Example :
        //1992      Leap Year
        //2000      Leap Year
        //1900      NOT a Leap Year


        Scanner nest = new Scanner(System.in);
        int year1 = nest.nextInt();

        if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 100 == 0 && year1 % 400 == 0)) {
            System.out.println(year1 + " is a leap year. ");


        } else {
            System.out.println(year1 + "is not a leap year. ");
        }


//Question 8

//Telephone Bill
//Write a program to calculate the monthly telephone bills as per the following rule:
//Minimum Rs. 200 for up to 100 calls.
//Plus Rs. 0.60 per call for next 50 calls.
//Plus Rs. 0.50 per call for next 50 calls.
//Plus Rs. 0.40 per call for any call beyond 200 calls.

        Scanner call = new Scanner(System.in);


        int x = call.nextInt();
        double y = ( 200+ ((x - 100) * 0.6));
        double z=  (200+ (50*0.6)+(x - 150) * 0.5);
        double q = (200+ (50*0.6)+ (50*0.5)+ (x - 200) * 0.4);

        if (x <= 100) {
            System.out.println("Your bill is $200.");
        } else if (x > 100 && x <= 150) {
            System.out.println("Your bill is $" + y);
        } else if (x > 150 && x <= 200) {
            System.out.println("Your bill is $" + z);
        } else {
            System.out.println("Your bill is $" + q);
        }
//Question 9
//Grade Calculator
//The marks obtained by a student in 3 different subjects are input by the user.
// Your program should calculate the average of subjects. The student gets a grade as per the following rules:
//Average
//Grade
//
//90-100  A
//80-89   B
//70-79   C
//60-69   D
//0-59    F
//
    Scanner calc= new Scanner(System.in);



        System.out.println(" Enter First Exam Score :  ");
        int ex1= calc.nextInt();
        System.out.println( "Enter Second Exam Score : ");
        int ex2= calc.nextInt();
        System.out.println( "Enter Third Exam score : ");
        int ex3= calc.nextInt();

        int avr= (ex1+ ex2+ ex3)/3;

        if (avr>=90 && avr<=100){
            System.out.println( "Your score is "+ avr + " and your grade is A. ");
        } else if (avr>= 80 && avr<=89){
            System.out.println(" Your score is " + avr+ " and your grade is B. ");
        } else if (avr>= 70 && avr<=79){
            System.out.println( " Your score is " + avr+ " and your grade is C. ");
        } else if (avr>=60 && avr<=69){
            System.out.println(" Your score is " + avr+ " and your grade is D. ");
        } else if (avr>=0 && avr<=59){
            System.out.println(" Your score is "+ avr+ " and your grade is F. ");
        } else{
            System.out.println( " Invalid score" );
        }
//Question 10
//Meaning of Grade
//Write a program that prompts the user to enter grade.
// Your program should display the corresponding meaning of grade as per the following table
//
//Grade    Meaning
//A        Excellent
//
//B        Good
//
//C        Average
//
//D        Deficient
//
//F        Failing


        char gr='B';
        String meaning ="";

        switch (gr ) {
            case 'A':
                meaning = "Excellent. ";
                break;
            case 'B':
                meaning = "Good. ";
                break;
            case 'C':
                meaning = "Average.  ";
                break;
            case 'D':
                meaning = "Deficient.  ";
                break;
            case 'F':
                meaning += "Failing.  ";
            default:
                meaning += "Invalid";
        }

        System.out.println( " Your grade is " +gr+ " and it meaning  "+ meaning);













    }
}





//Question 11
//
//Descending Order Names
//Write a program that prompts the user to enter three names.
// Your program should display the names in descending order.
















