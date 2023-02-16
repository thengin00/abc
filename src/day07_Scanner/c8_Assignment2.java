package day07_Scanner;

import java.util.Scanner;

public class c8_Assignment2 {

    public static void main(String[] args) {


        //Question 1
        //Even or Odd
        //Write a program that asks the user to enter a number and displays whether entered number is an odd number or even number.


        System.out.println("Please enter your number; we select even or odd number");
        Scanner input= new Scanner(System.in);
        int i1= input.nextInt();

        if (i1%2== 0){
            System.out.println(i1+ " is Even number .");
        }else{
            System.out.println(i1+ " is odd number . ");
        }

        //
        //Question 2
        //Absolute value
        //Write a program that asks the user to enter a number and displays the absolute value of that number.
        //


        System.out.println("Now let's find an absolute number. Please enter it here : ");
        Scanner output=new Scanner(System.in);
        short s1=output.nextShort();

        if (s1<0 ){
            s1= (short) (s1* -1);
            System.out.println("The absolut number for "+ -s1 +" is " +s1);
        }else if (s1>0 ){
            System.out.println("The absolute number for " + s1 + " is "+s1);
        }else{
            System.out.println("The number is invalid. ");
        }

        //Question 3
        //Discount and Revenue
        //Revenue can be calculated as the selling price of the product times the quantity sold, i.e. revenue = price × quantity.
        // Write a program that asks the user to enter product price and quantity and then calculate the revenue. If the revenue is more than 5000 a discount
        // is 10% offered. Program should display the discount and net revenue.
        //

        System.out.println("Enter your product price : " );
        Scanner price= new Scanner(System.in);
        int prc1= price.nextInt();
        System.out.println("Your product price is " + prc1);

        System.out.println("Enter your product quantity : ");
        Scanner quality= new Scanner(System.in);
        int qa1= quality.nextInt();
        System.out.println("Your product quality is " + qa1);

        int revenue= prc1 * qa1;
        int discount= revenue *10/100;

        if (revenue>5000){
            System.out.println("Your revenue is "+ revenue +" and Your discount is " +discount);
        } else {
            System.out.println("Your revenue is "+ revenue +" you don't have any discount. ");
        }




        //Question 4
        //Largest Number
        //Write a program that asks the user to enter a numbers in three variables and then displays the largest number.
        //
        System.out.println("Enter first number");
        Scanner max= new Scanner(System.in);


//Question 5
        //Positive, negative or zero
        //Write a program that prompts the user to input a number.
        // The program should then output the number and a message saying whether
        // the number is positive, negative, or zero.



        //Question 6
//
//Valid Triangle
//A triangle is valid if the sum of all the three angles is equal to 180 degrees.
// Write a program that asks the user to enter three integers as angles and
// check whether a triangle is valid or not.
//


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

        //Question 8

//Telephone Bill
//Write a program to calculate the monthly telephone bills as per the following rule:
//Minimum Rs. 200 for up to 100 calls.
//Plus Rs. 0.60 per call for next 50 calls.
//Plus Rs. 0.50 per call for next 50 calls.
//Plus Rs. 0.40 per call for any call beyond 200 calls.



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




        //Question 11
//
//Descending Order Names
//Write a program that prompts the user to enter three names.
// Your program should display the names in descending order.




    }
}
