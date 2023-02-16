package day05_ifcontinue;
import java.sql.SQLOutput;
public class c7_assignment {
    public static void main(String[] args) {
        //task 1: create a java program that will check if number is divisible by 2 and 5 same time
        int nb1= 240;

        if ((nb1%2==0) && (nb1%5==0)){

            System.out.println(nb1+" is divisible by 2 and 5");

        } else{

            System.out.println( nb1+" is not divisible by 2 and 5");
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("             ");

        //task 2: write  java program to find the largest among three numbers. 1) Using if-else..if

        int i1= 24;
        int i2= 46;
        int i3= 68;

        if((i1>i2) && (i1>i3)){
        System.out.println(" The largest number is "+ i1);

        } else if((i2>i1)&& (i2>i3)){
            System.out.println("The largest number is "+ i2);

        } else if ((i3>i1)&& (i3>i2)){
            System.out.println(" The largest number is "+i3);
        } else {
            System.out.println(" Whole number is equal. ");
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("             ");

        //task 3: create Program to check whether the given number is positive or negative
        //          → If a number is greater than zero then it is a positive number
        //          → If a number is less than zero then it is a negative number
        //          → If a number is equal to zero then it is neither negative nor positive.
         int n1= -28;

         if (n1>0){
             System.out.println( n1+ " is positive number");

         } else if (n1<0){
             System.out.println(n1+ " is negative number");
         } else {

             System.out.println(" The number is neither negative nor positive ");
         }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("             ");

         //Question 3
        ////Discount and Revenue
        ////Revenue can be calculated as the selling price of the product times the quantity sold, i.e. revenue = price × quantity.
        //// Write a program that asks the user to enter product price and quantity and then calculate the revenue.
        //// If the revenue is more than 5000 a discount is 10% offered.
        //// Program should display the discount and net revenue.

        int productprice= 75;
         int quantity= 150;
         int revenue=productprice * quantity;
         int discount= revenue* 10/100;
         if (revenue>5000){
             System.out.println("Revenue is " +revenue+ " discount is " +discount);

         } else {
             System.out.println("Revenue is "+ revenue + "discount is zero");
         }

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("             ");

        //Question 6
        //
        //Valid Triangle
        //A triangle is valid if the sum of all the three angles is equal to 180 degrees.
        //Write a program that asks the user to enter three integers as angles and check whether a triangle is valid or not.

        int ang1=75;
        int ang2=40;
        int ang3=65;
        int trang=ang1+ang2+ang3;

       if (trang==180){
            System.out.println(trang+" = Triangle is valid. ");

        } else {
           System.out.println(trang + " Triangle is not valid. ");
       }


       // to command everything choose all line in the class and then
        // click on command+ / for mac users
        //Click on ctrl+/ for windows users


        // to create a new project
        // file new project

        // to go previous step
        // click on ctrl +z or command +z
    }
}
